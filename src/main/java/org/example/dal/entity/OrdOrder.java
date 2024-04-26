package org.example.dal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * ord_order
 */
@Data
public class OrdOrder implements Serializable {
    private Long id;

    private String orderId;

    private Integer statusCd;

    private Double amount;

    private Integer deleteFlag;

    private static final long serialVersionUID = 1L;
}