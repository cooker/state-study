package org.example.statemachine.reverse.event;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.example.core.DaoHelper;
import org.example.core.IdUtils;
import org.example.dal.dao.OrdAfterDao;
import org.example.dal.dao.OrdAfterItemDao;
import org.example.dal.dao.OrdOrderItemDao;
import org.example.dal.model.OrdAfter;
import org.example.dal.model.OrdAfterItem;
import org.example.dal.model.OrdOrderItem;
import org.example.model.ddd.AfterCreateDto;
import org.example.statemachine.reverse.core.ReverseEventEnum;
import org.example.statemachine.reverse.core.ReverseHeaders;
import org.example.statemachine.reverse.core.ReverseStateEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.guard.Guard;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * grant
 * 11/4/2024 3:41 pm
 **/
@Configuration
public class ReverseStateListenerConfig {

    @Bean
    public ReverseCreateGuard reverseCreateGuard() {
        return new ReverseCreateGuard();
    }

    @Bean
    public ReverseCreateAction reverseCreateAction() {
        return new ReverseCreateAction();
    }

    @Bean
    public ReverseErrorAction reverseErrorAction() {
        return new ReverseErrorAction();
    }

    @Slf4j
    public static class ReverseCreateGuard implements Guard<ReverseStateEnum, ReverseEventEnum> {

        @Resource
        private OrdAfterDao afterDao;

        @Override
        public boolean evaluate(StateContext<ReverseStateEnum, ReverseEventEnum> context) {
            AfterCreateDto afterCreateDto = (AfterCreateDto) context.getMessageHeader("afterCreateDto");
            List<OrdAfter> ordAfterList = afterDao.findByOrderId(afterCreateDto.getOrderId());
            for (OrdAfter ordAfter : ordAfterList) {
                if (ReverseStateEnum.CREATED
                        .or(ReverseStateEnum.AUDIT_ING)
                        .or(ReverseStateEnum.DOING).test(ordAfter.getStatusCd())) {
                    log.info("存在未完结的售后单...");
                    return false;//存在售后中的订单
                }
            }
            return true;
        }
    }

    public static class ReverseCreateAction implements Action<ReverseStateEnum, ReverseEventEnum> {
        @Resource
        private OrdAfterDao afterDao;
        @Resource
        private OrdOrderItemDao ordOrderItemDao;
        @Resource
        private DaoHelper daoHelper;

        @Override
        @Transactional(rollbackFor = Exception.class)
        public void execute(StateContext<ReverseStateEnum, ReverseEventEnum> context) {
            AfterCreateDto afterCreateDto = (AfterCreateDto) context.getMessageHeader("afterCreateDto");
            String afterId = IdUtils.id();
            context.getExtendedState().getVariables().put(ReverseHeaders.AFTER_ID, afterId);
            OrdAfter ordAfter = new OrdAfter();
            ordAfter.setAfterId(afterId);
            ordAfter.setOrderId(afterCreateDto.getOrderId());
            ordAfter.setStatusCd(ReverseStateEnum.CREATED.getState());
            ordAfter.setAmount(BigDecimal.ZERO);
            List<OrdOrderItem> orderItemList = ordOrderItemDao.findByOrderId(afterCreateDto.getOrderId());
            List<OrdAfterItem> ordAfterItemList = new ArrayList<>();
            for (AfterCreateDto.Item item : afterCreateDto.getItemList()) {
                OrdOrderItem ordOrderItem = orderItemList.stream().filter(it -> StringUtils.equals(it.getOrderItemId(), item.getOrderItemId())).findFirst().get();
                OrdAfterItem ordAfterItem = new OrdAfterItem();
                ordAfterItem.setAfterId(afterId);
                ordAfterItem.setOrderItemId(item.getOrderItemId());
                ordAfterItem.setQty(item.getQty());
                ordAfterItem.setAmount(ordOrderItem.getAmount().divide(new BigDecimal(ordOrderItem.getQty()+"")).multiply(new BigDecimal(item.getQty() +"")));
                ordAfterItemList.add(ordAfterItem);
                ordAfter.setAmount(ordAfter.getAmount().add(ordAfterItem.getAmount()));
            }

            afterDao.insert(ordAfter);
            daoHelper.insertBatch(OrdAfterItemDao.class, ordAfterItemList);
            throw new RuntimeException("sasa");
        }
    }

    @Slf4j
    public static class ReverseErrorAction implements Action<ReverseStateEnum, ReverseEventEnum> {
        @Override
        public void execute(StateContext<ReverseStateEnum, ReverseEventEnum> context) {
          log.info("售后失败 >>>> ");
        }
    }
}
