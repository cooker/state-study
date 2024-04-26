package org.example.dal.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * ord_after
 */
@Data
public class OrdAfter implements Serializable {
    private Long id;

    private String afterId;

    private String orderId;

    private Integer statusCd;

    private Double amount;

    private static final long serialVersionUID = 1L;
}