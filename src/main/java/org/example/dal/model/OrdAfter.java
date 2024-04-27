package org.example.dal.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrdAfter implements Serializable {
    private Long id;

    private Integer typeCd;

    private String afterId;

    private String orderId;

    private Integer statusCd;

    private BigDecimal amount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(Integer typeCd) {
        this.typeCd = typeCd;
    }

    public String getAfterId() {
        return afterId;
    }

    public void setAfterId(String afterId) {
        this.afterId = afterId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrdAfter other = (OrdAfter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeCd() == null ? other.getTypeCd() == null : this.getTypeCd().equals(other.getTypeCd()))
            && (this.getAfterId() == null ? other.getAfterId() == null : this.getAfterId().equals(other.getAfterId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getStatusCd() == null ? other.getStatusCd() == null : this.getStatusCd().equals(other.getStatusCd()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeCd() == null) ? 0 : getTypeCd().hashCode());
        result = prime * result + ((getAfterId() == null) ? 0 : getAfterId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getStatusCd() == null) ? 0 : getStatusCd().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        return result;
    }
}