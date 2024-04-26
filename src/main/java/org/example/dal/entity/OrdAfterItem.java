package org.example.dal.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * ord_after_item
 */
@Data
public class OrdAfterItem implements Serializable {
    private Long id;

    private String afterId;

    private String orderItemId;

    private Integer qty;

    private Double amount;

    private Integer deleteFlag;

    private static final long serialVersionUID = 1L;
}