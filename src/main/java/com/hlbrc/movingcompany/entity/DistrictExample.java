package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.List;

public class DistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistrictExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDisidIsNull() {
            addCriterion("disId is null");
            return (Criteria) this;
        }

        public Criteria andDisidIsNotNull() {
            addCriterion("disId is not null");
            return (Criteria) this;
        }

        public Criteria andDisidEqualTo(Integer value) {
            addCriterion("disId =", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotEqualTo(Integer value) {
            addCriterion("disId <>", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidGreaterThan(Integer value) {
            addCriterion("disId >", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("disId >=", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidLessThan(Integer value) {
            addCriterion("disId <", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidLessThanOrEqualTo(Integer value) {
            addCriterion("disId <=", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidIn(List<Integer> values) {
            addCriterion("disId in", values, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotIn(List<Integer> values) {
            addCriterion("disId not in", values, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidBetween(Integer value1, Integer value2) {
            addCriterion("disId between", value1, value2, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotBetween(Integer value1, Integer value2) {
            addCriterion("disId not between", value1, value2, "disid");
            return (Criteria) this;
        }

        public Criteria andDisnameIsNull() {
            addCriterion("disName is null");
            return (Criteria) this;
        }

        public Criteria andDisnameIsNotNull() {
            addCriterion("disName is not null");
            return (Criteria) this;
        }

        public Criteria andDisnameEqualTo(String value) {
            addCriterion("disName =", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameNotEqualTo(String value) {
            addCriterion("disName <>", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameGreaterThan(String value) {
            addCriterion("disName >", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameGreaterThanOrEqualTo(String value) {
            addCriterion("disName >=", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameLessThan(String value) {
            addCriterion("disName <", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameLessThanOrEqualTo(String value) {
            addCriterion("disName <=", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameLike(String value) {
            addCriterion("disName like", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameNotLike(String value) {
            addCriterion("disName not like", value, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameIn(List<String> values) {
            addCriterion("disName in", values, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameNotIn(List<String> values) {
            addCriterion("disName not in", values, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameBetween(String value1, String value2) {
            addCriterion("disName between", value1, value2, "disname");
            return (Criteria) this;
        }

        public Criteria andDisnameNotBetween(String value1, String value2) {
            addCriterion("disName not between", value1, value2, "disname");
            return (Criteria) this;
        }

        public Criteria andCitidIsNull() {
            addCriterion("citId is null");
            return (Criteria) this;
        }

        public Criteria andCitidIsNotNull() {
            addCriterion("citId is not null");
            return (Criteria) this;
        }

        public Criteria andCitidEqualTo(String value) {
            addCriterion("citId =", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotEqualTo(String value) {
            addCriterion("citId <>", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThan(String value) {
            addCriterion("citId >", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThanOrEqualTo(String value) {
            addCriterion("citId >=", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidLessThan(String value) {
            addCriterion("citId <", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidLessThanOrEqualTo(String value) {
            addCriterion("citId <=", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidLike(String value) {
            addCriterion("citId like", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotLike(String value) {
            addCriterion("citId not like", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidIn(List<String> values) {
            addCriterion("citId in", values, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotIn(List<String> values) {
            addCriterion("citId not in", values, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidBetween(String value1, String value2) {
            addCriterion("citId between", value1, value2, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotBetween(String value1, String value2) {
            addCriterion("citId not between", value1, value2, "citid");
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