package org.example.model.ddd;

import lombok.Data;

import java.util.List;

/**
 * grant
 * 2024/4/15 11:16
 **/
@Data
public class AfterCreateDto {

    private String orderId;
    private Integer typeCd;
    private List<Item> itemList;

    @Data
    public static class Item {
        private String orderItemId;

        private Integer qty;
    }
}
