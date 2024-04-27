package org.example.dal.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdAfterWorkflowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdAfterWorkflowExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAfterIdIsNull() {
            addCriterion("after_id is null");
            return (Criteria) this;
        }

        public Criteria andAfterIdIsNotNull() {
            addCriterion("after_id is not null");
            return (Criteria) this;
        }

        public Criteria andAfterIdEqualTo(String value) {
            addCriterion("after_id =", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotEqualTo(String value) {
            addCriterion("after_id <>", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdGreaterThan(String value) {
            addCriterion("after_id >", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdGreaterThanOrEqualTo(String value) {
            addCriterion("after_id >=", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdLessThan(String value) {
            addCriterion("after_id <", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdLessThanOrEqualTo(String value) {
            addCriterion("after_id <=", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdLike(String value) {
            addCriterion("after_id like", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotLike(String value) {
            addCriterion("after_id not like", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdIn(List<String> values) {
            addCriterion("after_id in", values, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotIn(List<String> values) {
            addCriterion("after_id not in", values, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdBetween(String value1, String value2) {
            addCriterion("after_id between", value1, value2, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotBetween(String value1, String value2) {
            addCriterion("after_id not between", value1, value2, "afterId");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdIsNull() {
            addCriterion("current_status_cd is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdIsNotNull() {
            addCriterion("current_status_cd is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdEqualTo(Integer value) {
            addCriterion("current_status_cd =", value, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdNotEqualTo(Integer value) {
            addCriterion("current_status_cd <>", value, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdGreaterThan(Integer value) {
            addCriterion("current_status_cd >", value, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_status_cd >=", value, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdLessThan(Integer value) {
            addCriterion("current_status_cd <", value, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdLessThanOrEqualTo(Integer value) {
            addCriterion("current_status_cd <=", value, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdIn(List<Integer> values) {
            addCriterion("current_status_cd in", values, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdNotIn(List<Integer> values) {
            addCriterion("current_status_cd not in", values, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdBetween(Integer value1, Integer value2) {
            addCriterion("current_status_cd between", value1, value2, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusCdNotBetween(Integer value1, Integer value2) {
            addCriterion("current_status_cd not between", value1, value2, "currentStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdIsNull() {
            addCriterion("next_status_cd is null");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdIsNotNull() {
            addCriterion("next_status_cd is not null");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdEqualTo(Integer value) {
            addCriterion("next_status_cd =", value, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdNotEqualTo(Integer value) {
            addCriterion("next_status_cd <>", value, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdGreaterThan(Integer value) {
            addCriterion("next_status_cd >", value, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdGreaterThanOrEqualTo(Integer value) {
            addCriterion("next_status_cd >=", value, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdLessThan(Integer value) {
            addCriterion("next_status_cd <", value, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdLessThanOrEqualTo(Integer value) {
            addCriterion("next_status_cd <=", value, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdIn(List<Integer> values) {
            addCriterion("next_status_cd in", values, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdNotIn(List<Integer> values) {
            addCriterion("next_status_cd not in", values, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdBetween(Integer value1, Integer value2) {
            addCriterion("next_status_cd between", value1, value2, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andNextStatusCdNotBetween(Integer value1, Integer value2) {
            addCriterion("next_status_cd not between", value1, value2, "nextStatusCd");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(LocalDateTime value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(LocalDateTime value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(LocalDateTime value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<LocalDateTime> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}