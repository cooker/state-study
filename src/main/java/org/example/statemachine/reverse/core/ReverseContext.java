package org.example.statemachine.reverse.core;

import lombok.Data;
import org.example.core.enums.AfterTypeCdEnum;

import java.io.Serializable;
import java.util.List;

/**
 * grant
 * 27/4/2024 9:03 pm
 **/
@Data
public class ReverseContext implements Serializable {

    private AfterTypeCdEnum afterTypeCd;

    private String afterId;
    private List<ItemContext> itemContextList;



    @Data
    public static class ItemContext implements Serializable {

        private static final long serialVersionUID = 8239870699987813376L;

        /**
         * 商品名称
         */
        private String itemName;

        /**
         * 明细ID
         */
        private Long itemId;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 数量
         */
        private Integer qty;
    }

}
