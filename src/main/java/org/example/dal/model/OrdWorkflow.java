package org.example.dal.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrdWorkflow implements Serializable {
    private Long id;

    private String orderId;

    private String afterId;

    private Integer currentStatusCd;

    private Integer nextStatusCd;

    private LocalDateTime createdTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAfterId() {
        return afterId;
    }

    public void setAfterId(String afterId) {
        this.afterId = afterId;
    }

    public Integer getCurrentStatusCd() {
        return currentStatusCd;
    }

    public void setCurrentStatusCd(Integer currentStatusCd) {
        this.currentStatusCd = currentStatusCd;
    }

    public Integer getNextStatusCd() {
        return nextStatusCd;
    }

    public void setNextStatusCd(Integer nextStatusCd) {
        this.nextStatusCd = nextStatusCd;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        OrdWorkflow other = (OrdWorkflow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getAfterId() == null ? other.getAfterId() == null : this.getAfterId().equals(other.getAfterId()))
            && (this.getCurrentStatusCd() == null ? other.getCurrentStatusCd() == null : this.getCurrentStatusCd().equals(other.getCurrentStatusCd()))
            && (this.getNextStatusCd() == null ? other.getNextStatusCd() == null : this.getNextStatusCd().equals(other.getNextStatusCd()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getAfterId() == null) ? 0 : getAfterId().hashCode());
        result = prime * result + ((getCurrentStatusCd() == null) ? 0 : getCurrentStatusCd().hashCode());
        result = prime * result + ((getNextStatusCd() == null) ? 0 : getNextStatusCd().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}