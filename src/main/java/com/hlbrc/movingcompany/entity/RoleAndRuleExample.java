package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleAndRuleExample {
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

    public RoleAndRuleExample() {
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

        public Criteria andRoleandruleidIsNull() {
            addCriterion("roleAndRuleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidIsNotNull() {
            addCriterion("roleAndRuleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidEqualTo(Integer value) {
            addCriterion("roleAndRuleId =", value, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidNotEqualTo(Integer value) {
            addCriterion("roleAndRuleId <>", value, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidGreaterThan(Integer value) {
            addCriterion("roleAndRuleId >", value, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleAndRuleId >=", value, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidLessThan(Integer value) {
            addCriterion("roleAndRuleId <", value, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleAndRuleId <=", value, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidIn(List<Integer> values) {
            addCriterion("roleAndRuleId in", values, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidNotIn(List<Integer> values) {
            addCriterion("roleAndRuleId not in", values, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidBetween(Integer value1, Integer value2) {
            addCriterion("roleAndRuleId between", value1, value2, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andRoleandruleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleAndRuleId not between", value1, value2, "roleandruleid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridIsNull() {
            addCriterion("authorityManagerId is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridIsNotNull() {
            addCriterion("authorityManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridEqualTo(Integer value) {
            addCriterion("authorityManagerId =", value, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridNotEqualTo(Integer value) {
            addCriterion("authorityManagerId <>", value, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridGreaterThan(Integer value) {
            addCriterion("authorityManagerId >", value, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorityManagerId >=", value, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridLessThan(Integer value) {
            addCriterion("authorityManagerId <", value, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridLessThanOrEqualTo(Integer value) {
            addCriterion("authorityManagerId <=", value, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridIn(List<Integer> values) {
            addCriterion("authorityManagerId in", values, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridNotIn(List<Integer> values) {
            addCriterion("authorityManagerId not in", values, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridBetween(Integer value1, Integer value2) {
            addCriterion("authorityManagerId between", value1, value2, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andAuthoritymanageridNotBetween(Integer value1, Integer value2) {
            addCriterion("authorityManagerId not between", value1, value2, "authoritymanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridIsNull() {
            addCriterion("roleManagerId is null");
            return (Criteria) this;
        }

        public Criteria andRolemanageridIsNotNull() {
            addCriterion("roleManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andRolemanageridEqualTo(Integer value) {
            addCriterion("roleManagerId =", value, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridNotEqualTo(Integer value) {
            addCriterion("roleManagerId <>", value, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridGreaterThan(Integer value) {
            addCriterion("roleManagerId >", value, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleManagerId >=", value, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridLessThan(Integer value) {
            addCriterion("roleManagerId <", value, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridLessThanOrEqualTo(Integer value) {
            addCriterion("roleManagerId <=", value, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridIn(List<Integer> values) {
            addCriterion("roleManagerId in", values, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridNotIn(List<Integer> values) {
            addCriterion("roleManagerId not in", values, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridBetween(Integer value1, Integer value2) {
            addCriterion("roleManagerId between", value1, value2, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andRolemanageridNotBetween(Integer value1, Integer value2) {
            addCriterion("roleManagerId not between", value1, value2, "rolemanagerid");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Integer value) {
            addCriterion("managerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Integer value) {
            addCriterion("managerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Integer value) {
            addCriterion("managerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Integer value) {
            addCriterion("managerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Integer value) {
            addCriterion("managerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Integer> values) {
            addCriterion("managerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Integer> values) {
            addCriterion("managerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Integer value1, Integer value2) {
            addCriterion("managerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Integer value1, Integer value2) {
            addCriterion("managerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusIsNull() {
            addCriterion("roleAndRuleStatus is null");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusIsNotNull() {
            addCriterion("roleAndRuleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusEqualTo(String value) {
            addCriterion("roleAndRuleStatus =", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusNotEqualTo(String value) {
            addCriterion("roleAndRuleStatus <>", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusGreaterThan(String value) {
            addCriterion("roleAndRuleStatus >", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusGreaterThanOrEqualTo(String value) {
            addCriterion("roleAndRuleStatus >=", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusLessThan(String value) {
            addCriterion("roleAndRuleStatus <", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusLessThanOrEqualTo(String value) {
            addCriterion("roleAndRuleStatus <=", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusLike(String value) {
            addCriterion("roleAndRuleStatus like", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusNotLike(String value) {
            addCriterion("roleAndRuleStatus not like", value, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusIn(List<String> values) {
            addCriterion("roleAndRuleStatus in", values, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusNotIn(List<String> values) {
            addCriterion("roleAndRuleStatus not in", values, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusBetween(String value1, String value2) {
            addCriterion("roleAndRuleStatus between", value1, value2, "roleandrulestatus");
            return (Criteria) this;
        }

        public Criteria andRoleandrulestatusNotBetween(String value1, String value2) {
            addCriterion("roleAndRuleStatus not between", value1, value2, "roleandrulestatus");
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