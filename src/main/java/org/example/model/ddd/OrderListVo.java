package org.example.model.ddd;

import lombok.Data;

/**
 * grant
 * 11/4/2024 3:46 pm
 **/
@Data
public class OrderListVo {

    private String orderId;

    private String orderItemId;

    private Integer qty;
}
