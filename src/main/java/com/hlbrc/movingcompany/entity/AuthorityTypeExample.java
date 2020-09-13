package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthorityTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    private Integer pageIndex;
    private Integer pageSize;
     public Integer getPageIndex() {
         return pageIndex;
     }
     public void setPageIndex(Integer pageIndex) {
         this.pageIndex = pageIndex;
     }
     public Integer getPageSize() {
         return pageSize;
     }
     public void setPageSize(Integer pageSize) {
         this.pageSize = pageSize;
     }

    public AuthorityTypeExample() {
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

        public Criteria andAuthoritytypeidIsNull() {
            addCriterion("authorityTypeId is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidIsNotNull() {
            addCriterion("authorityTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidEqualTo(Integer value) {
            addCriterion("authorityTypeId =", value, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidNotEqualTo(Integer value) {
            addCriterion("authorityTypeId <>", value, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidGreaterThan(Integer value) {
            addCriterion("authorityTypeId >", value, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorityTypeId >=", value, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidLessThan(Integer value) {
            addCriterion("authorityTypeId <", value, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidLessThanOrEqualTo(Integer value) {
            addCriterion("authorityTypeId <=", value, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidIn(List<Integer> values) {
            addCriterion("authorityTypeId in", values, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidNotIn(List<Integer> values) {
            addCriterion("authorityTypeId not in", values, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidBetween(Integer value1, Integer value2) {
            addCriterion("authorityTypeId between", value1, value2, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("authorityTypeId not between", value1, value2, "authoritytypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameIsNull() {
            addCriterion("authorityName is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameIsNotNull() {
            addCriterion("authorityName is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameEqualTo(String value) {
            addCriterion("authorityName =", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotEqualTo(String value) {
            addCriterion("authorityName <>", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameGreaterThan(String value) {
            addCriterion("authorityName >", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameGreaterThanOrEqualTo(String value) {
            addCriterion("authorityName >=", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameLessThan(String value) {
            addCriterion("authorityName <", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameLessThanOrEqualTo(String value) {
            addCriterion("authorityName <=", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameLike(String value) {
            addCriterion("authorityName like", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotLike(String value) {
            addCriterion("authorityName not like", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameIn(List<String> values) {
            addCriterion("authorityName in", values, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotIn(List<String> values) {
            addCriterion("authorityName not in", values, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameBetween(String value1, String value2) {
            addCriterion("authorityName between", value1, value2, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotBetween(String value1, String value2) {
            addCriterion("authorityName not between", value1, value2, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusIsNull() {
            addCriterion("authoritytypestatus is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusIsNotNull() {
            addCriterion("authoritytypestatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusEqualTo(String value) {
            addCriterion("authoritytypestatus =", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusNotEqualTo(String value) {
            addCriterion("authoritytypestatus <>", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusGreaterThan(String value) {
            addCriterion("authoritytypestatus >", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusGreaterThanOrEqualTo(String value) {
            addCriterion("authoritytypestatus >=", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusLessThan(String value) {
            addCriterion("authoritytypestatus <", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusLessThanOrEqualTo(String value) {
            addCriterion("authoritytypestatus <=", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusLike(String value) {
            addCriterion("authoritytypestatus like", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusNotLike(String value) {
            addCriterion("authoritytypestatus not like", value, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusIn(List<String> values) {
            addCriterion("authoritytypestatus in", values, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusNotIn(List<String> values) {
            addCriterion("authoritytypestatus not in", values, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusBetween(String value1, String value2) {
            addCriterion("authoritytypestatus between", value1, value2, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andAuthoritytypestatusNotBetween(String value1, String value2) {
            addCriterion("authoritytypestatus not between", value1, value2, "authoritytypestatus");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Integer value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Integer value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Integer value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Integer value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Integer> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Integer> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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