package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.core.IdUtils;
import org.example.entity.OrdOrder;
import org.example.entity.OrdOrderItem;
import org.example.mapper.OrdOrderDao;
import org.example.mapper.OrdOrderItemDao;
import org.example.statemachine.forward.core.OrderStateEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
