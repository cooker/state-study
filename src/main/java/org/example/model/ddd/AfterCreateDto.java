package org.example.dal.entity.ddd;

import lombok.Data;

import java.util.List;

/**
 * grant
 * 2024/4/15 11:16
 **/
@Data
public class AfterCreateDto {

    private String orderId;
    private List<Item> itemList;

    @Data
    public static class Item {
        private String orderItemId;

        private Integer qty;
    }
}
