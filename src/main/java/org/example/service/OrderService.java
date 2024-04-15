package org.example.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.example.core.IdUtils;
import org.example.entity.OrdOrder;
import org.example.entity.OrdOrderItem;
import org.example.entity.ddd.OrderListVo;
import org.example.mapper.OrdOrderDao;
import org.example.mapper.OrdOrderItemDao;
import org.example.statemachine.forward.core.OrderStateEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    public String create() {
        String orderId = IdUtils.id();
        log.info("创建订单：{}", orderId);

        OrdOrder ordOrder = new OrdOrder();
        ordOrder.setOrderId(orderId);
        ordOrder.setStatusCd(OrderStateEnum.S4.getStatusCd());
        ordOrder.setAmount(10.0);
        ordOrder.setDeleteFlag(0);

        ordOrderDao.insert(ordOrder);

        OrdOrderItem ordOrderItem = new OrdOrderItem();
        ordOrderItem.setOrderId(orderId);
        ordOrderItem.setOrderItemId(IdUtils.id());
        ordOrderItem.setQty(5);
        ordOrderItem.setAmount(10.0);
        ordOrderItem.setDeleteFlag(0);
        ordOrderItemDao.insert(ordOrderItem);

        return orderId;
    }

    public List<OrderListVo> list() {
        List<OrdOrderItem> datas = ordOrderItemDao.selectList(Wrappers.emptyWrapper());
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
}
