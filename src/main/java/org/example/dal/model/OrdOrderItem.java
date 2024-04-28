package org.example.dal.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 *
 * create By Grant
 * 2024-04-28 23:30:05
 * 表名： ord_order_item
 *
 */
@Accessors(chain = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdOrderItem implements Serializable {
    private Long id;

    /**
     * Database Column Remarks:
     *   订单号
     */
    private String orderId;

    /**
     * Database Column Remarks:
     *   订单明细号
     */
    private String orderItemId;

    /**
     * Database Column Remarks:
     *   商品编号
     */
    private String skuId;

    /**
     * Database Column Remarks:
     *   商品名称
     */
    private String skuName;

    /**
     * Database Column Remarks:
     *   数量
     */
    private Integer qty;

    /**
     * Database Column Remarks:
     *   总金额
     */
    private BigDecimal amount;

    private Integer deleteFlag;

    private static final long serialVersionUID = 1L;

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ord_order_item
     *
     * @mbg.generated
     */
    public static enum Column {
        id("id", "id", "BIGINT", false),
        orderId("order_id", "orderId", "VARCHAR", false),
        orderItemId("order_item_id", "orderItemId", "VARCHAR", false),
        skuId("sku_id", "skuId", "VARCHAR", false),
        skuName("sku_name", "skuName", "VARCHAR", false),
        qty("qty", "qty", "INTEGER", false),
        amount("amount", "amount", "DECIMAL", false),
        deleteFlag("delete_flag", "deleteFlag", "TINYINT", false);

        private static final String BEGINNING_DELIMITER = "'";

        private static final String ENDING_DELIMITER = "'";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}