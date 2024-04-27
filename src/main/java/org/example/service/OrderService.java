package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.example.core.IdUtils;
import org.example.dal.dao.OrdOrderDao;
import org.example.dal.dao.OrdOrderItemDao;
import org.example.dal.model.OrdOrder;
import org.example.dal.model.OrdOrderItem;
import org.example.dal.model.OrdOrderItemExample;
import org.example.model.ddd.OrderCancelDto;
import org.example.model.ddd.OrderListVo;
import org.example.statemachine.forward.core.OrderStateEnum;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * grant
 * 28/3/2024 5:35 pm
 **/
@Slf4j
@Service
public class OrderService {
    @Resource
    private OrdOrderDao ordOrderDao;
    @Resource
    private OrdOrderItemDao ordOrderItemDao;

    @Transactional(rollbackFor = Exception.class)
    public String create() {
        String orderId = IdUtils.id();
        log.info("创建订单：{}", orderId);

        OrdOrder ordOrder = new OrdOrder();
        ordOrder.setOrderId(orderId);
        ordOrder.setStatusCd(RandomUtils.nextBoolean() ? OrderStateEnum.S0.getStatusCd() : OrderStateEnum.S4.getStatusCd());
        ordOrder.setAmount(BigDecimal.TEN);
        ordOrder.setDeleteFlag(0);

        ordOrderDao.insert(ordOrder);

        OrdOrderItem ordOrderItem = new OrdOrderItem();
        ordOrderItem.setOrderId(orderId);
        ordOrderItem.setOrderItemId(IdUtils.id());
        ordOrderItem.setQty(5);
        ordOrderItem.setAmount(BigDecimal.TEN);
        ordOrderItem.setDeleteFlag(0);
        ordOrderItemDao.insert(ordOrderItem);

        if (RandomUtils.nextBoolean()) {
            throw new RuntimeException();
        }

        return orderId;
    }

    public List<OrderListVo> list() {
        List<OrdOrderItem> datas = ordOrderItemDao.selectByExample(new OrdOrderItemExample());
        List<OrderListVo> result = new ArrayList<>();
        for (OrdOrderItem it : datas) {
            OrderListVo vo = new OrderListVo();
            vo.setOrderId(it.getOrderId());
            vo.setOrderItemId(it.getOrderItemId());
            vo.setQty(it.getQty());
            result.add(vo);
        }
        return result;
    }

    public String cancel(OrderCancelDto body) {
        OrdOrder ordOrder = ordOrderDao.findByOrderId(body.getOrderId());
        if (OrderStateEnum.S0.test(ordOrder.getStatusCd())) {
            //传统写法
            // 1. 直接关闭订单
            // 2. 记录日志

        }
        return "ok";
    }
}
