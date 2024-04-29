package org.example.dal.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 *
 * @author Grant
 * 表名： ord_workflow
 *
 */
@Accessors(chain = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdWorkflow implements Serializable {
    private Long id;

    /**
     * Database Column Remarks:
     *   订单号
     */
    private String orderId;

    /**
     * Database Column Remarks:
     *   售后单号
     */
    private String afterId;

    /**
     * Database Column Remarks:
     *   当前状态
     */
    private Integer currentStatusCd;

    /**
     * Database Column Remarks:
     *   下一个状态
     */
    private Integer nextStatusCd;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    private LocalDateTime createdTime;

    /**
     * Database Column Remarks:
     *   描述
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ord_workflow
     *
     * @mbg.generated
     */
    public static enum Column {
        id("id", "id", "BIGINT", false),
        orderId("order_id", "orderId", "VARCHAR", false),
        afterId("after_id", "afterId", "VARCHAR", false),
        currentStatusCd("current_status_cd", "currentStatusCd", "TINYINT", false),
        nextStatusCd("next_status_cd", "nextStatusCd", "TINYINT", false),
        createdTime("created_time", "createdTime", "TIMESTAMP", false),
        remark("remark", "remark", "VARCHAR", false);

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