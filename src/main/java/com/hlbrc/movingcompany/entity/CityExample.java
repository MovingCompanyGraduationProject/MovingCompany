package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
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

        public Criteria andCitidIsNull() {
            addCriterion("citId is null");
            return (Criteria) this;
        }

        public Criteria andCitidIsNotNull() {
            addCriterion("citId is not null");
            return (Criteria) this;
        }

        public Criteria andCitidEqualTo(Integer value) {
            addCriterion("citId =", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotEqualTo(Integer value) {
            addCriterion("citId <>", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThan(Integer value) {
            addCriterion("citId >", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("citId >=", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidLessThan(Integer value) {
            addCriterion("citId <", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidLessThanOrEqualTo(Integer value) {
            addCriterion("citId <=", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidIn(List<Integer> values) {
            addCriterion("citId in", values, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotIn(List<Integer> values) {
            addCriterion("citId not in", values, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidBetween(Integer value1, Integer value2) {
            addCriterion("citId between", value1, value2, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotBetween(Integer value1, Integer value2) {
            addCriterion("citId not between", value1, value2, "citid");
            return (Criteria) this;
        }

        public Criteria andCitnameIsNull() {
            addCriterion("citName is null");
            return (Criteria) this;
        }

        public Criteria andCitnameIsNotNull() {
            addCriterion("citName is not null");
            return (Criteria) this;
        }

        public Criteria andCitnameEqualTo(String value) {
            addCriterion("citName =", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameNotEqualTo(String value) {
            addCriterion("citName <>", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameGreaterThan(String value) {
            addCriterion("citName >", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameGreaterThanOrEqualTo(String value) {
            addCriterion("citName >=", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameLessThan(String value) {
            addCriterion("citName <", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameLessThanOrEqualTo(String value) {
            addCriterion("citName <=", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameLike(String value) {
            addCriterion("citName like", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameNotLike(String value) {
            addCriterion("citName not like", value, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameIn(List<String> values) {
            addCriterion("citName in", values, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameNotIn(List<String> values) {
            addCriterion("citName not in", values, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameBetween(String value1, String value2) {
            addCriterion("citName between", value1, value2, "citname");
            return (Criteria) this;
        }

        public Criteria andCitnameNotBetween(String value1, String value2) {
            addCriterion("citName not between", value1, value2, "citname");
            return (Criteria) this;
        }

        public Criteria andProidIsNull() {
            addCriterion("proId is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proId is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("proId =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("proId <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("proId >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("proId >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("proId <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("proId <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("proId like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("proId not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("proId in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("proId not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("proId between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("proId not between", value1, value2, "proid");
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