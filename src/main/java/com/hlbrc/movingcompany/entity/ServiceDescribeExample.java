package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.List;

public class ServiceDescribeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceDescribeExample() {
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

        public Criteria andServicedescribeidIsNull() {
            addCriterion("serviceDescribeId is null");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidIsNotNull() {
            addCriterion("serviceDescribeId is not null");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidEqualTo(Integer value) {
            addCriterion("serviceDescribeId =", value, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidNotEqualTo(Integer value) {
            addCriterion("serviceDescribeId <>", value, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidGreaterThan(Integer value) {
            addCriterion("serviceDescribeId >", value, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serviceDescribeId >=", value, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidLessThan(Integer value) {
            addCriterion("serviceDescribeId <", value, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidLessThanOrEqualTo(Integer value) {
            addCriterion("serviceDescribeId <=", value, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidIn(List<Integer> values) {
            addCriterion("serviceDescribeId in", values, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidNotIn(List<Integer> values) {
            addCriterion("serviceDescribeId not in", values, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidBetween(Integer value1, Integer value2) {
            addCriterion("serviceDescribeId between", value1, value2, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andServicedescribeidNotBetween(Integer value1, Integer value2) {
            addCriterion("serviceDescribeId not between", value1, value2, "servicedescribeid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidIsNull() {
            addCriterion("CompanyMessageId is null");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidIsNotNull() {
            addCriterion("CompanyMessageId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidEqualTo(Integer value) {
            addCriterion("CompanyMessageId =", value, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidNotEqualTo(Integer value) {
            addCriterion("CompanyMessageId <>", value, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidGreaterThan(Integer value) {
            addCriterion("CompanyMessageId >", value, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CompanyMessageId >=", value, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidLessThan(Integer value) {
            addCriterion("CompanyMessageId <", value, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidLessThanOrEqualTo(Integer value) {
            addCriterion("CompanyMessageId <=", value, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidIn(List<Integer> values) {
            addCriterion("CompanyMessageId in", values, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidNotIn(List<Integer> values) {
            addCriterion("CompanyMessageId not in", values, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidBetween(Integer value1, Integer value2) {
            addCriterion("CompanyMessageId between", value1, value2, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andCompanymessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("CompanyMessageId not between", value1, value2, "companymessageid");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andContextnumIsNull() {
            addCriterion("contextNum is null");
            return (Criteria) this;
        }

        public Criteria andContextnumIsNotNull() {
            addCriterion("contextNum is not null");
            return (Criteria) this;
        }

        public Criteria andContextnumEqualTo(String value) {
            addCriterion("contextNum =", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumNotEqualTo(String value) {
            addCriterion("contextNum <>", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumGreaterThan(String value) {
            addCriterion("contextNum >", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumGreaterThanOrEqualTo(String value) {
            addCriterion("contextNum >=", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumLessThan(String value) {
            addCriterion("contextNum <", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumLessThanOrEqualTo(String value) {
            addCriterion("contextNum <=", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumLike(String value) {
            addCriterion("contextNum like", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumNotLike(String value) {
            addCriterion("contextNum not like", value, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumIn(List<String> values) {
            addCriterion("contextNum in", values, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumNotIn(List<String> values) {
            addCriterion("contextNum not in", values, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumBetween(String value1, String value2) {
            addCriterion("contextNum between", value1, value2, "contextnum");
            return (Criteria) this;
        }

        public Criteria andContextnumNotBetween(String value1, String value2) {
            addCriterion("contextNum not between", value1, value2, "contextnum");
            return (Criteria) this;
        }

        public Criteria andSpecialannIsNull() {
            addCriterion("specialAnn is null");
            return (Criteria) this;
        }

        public Criteria andSpecialannIsNotNull() {
            addCriterion("specialAnn is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialannEqualTo(String value) {
            addCriterion("specialAnn =", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannNotEqualTo(String value) {
            addCriterion("specialAnn <>", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannGreaterThan(String value) {
            addCriterion("specialAnn >", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannGreaterThanOrEqualTo(String value) {
            addCriterion("specialAnn >=", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannLessThan(String value) {
            addCriterion("specialAnn <", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannLessThanOrEqualTo(String value) {
            addCriterion("specialAnn <=", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannLike(String value) {
            addCriterion("specialAnn like", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannNotLike(String value) {
            addCriterion("specialAnn not like", value, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannIn(List<String> values) {
            addCriterion("specialAnn in", values, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannNotIn(List<String> values) {
            addCriterion("specialAnn not in", values, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannBetween(String value1, String value2) {
            addCriterion("specialAnn between", value1, value2, "specialann");
            return (Criteria) this;
        }

        public Criteria andSpecialannNotBetween(String value1, String value2) {
            addCriterion("specialAnn not between", value1, value2, "specialann");
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