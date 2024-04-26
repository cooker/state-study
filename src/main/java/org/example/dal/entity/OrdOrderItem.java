package org.example.dal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * ord_order_item
 */
@Data
public class OrdOrderItem implements Serializable {
    private Long id;

    private String orderId;

    private String orderItemId;

    private Integer qty;

    private Double amount;

    private Integer deleteFlag;

    private static final long serialVersionUID = 1L;
}