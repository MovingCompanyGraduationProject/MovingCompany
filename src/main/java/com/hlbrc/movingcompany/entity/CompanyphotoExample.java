package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyphotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyphotoExample() {
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

        public Criteria andCompanyphotoIsNull() {
            addCriterion("companyPhoto is null");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoIsNotNull() {
            addCriterion("companyPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoEqualTo(Integer value) {
            addCriterion("companyPhoto =", value, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoNotEqualTo(Integer value) {
            addCriterion("companyPhoto <>", value, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoGreaterThan(Integer value) {
            addCriterion("companyPhoto >", value, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyPhoto >=", value, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoLessThan(Integer value) {
            addCriterion("companyPhoto <", value, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoLessThanOrEqualTo(Integer value) {
            addCriterion("companyPhoto <=", value, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoIn(List<Integer> values) {
            addCriterion("companyPhoto in", values, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoNotIn(List<Integer> values) {
            addCriterion("companyPhoto not in", values, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoBetween(Integer value1, Integer value2) {
            addCriterion("companyPhoto between", value1, value2, "companyphoto");
            return (Criteria) this;
        }

        public Criteria andCompanyphotoNotBetween(Integer value1, Integer value2) {
            addCriterion("companyPhoto not between", value1, value2, "companyphoto");
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

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
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