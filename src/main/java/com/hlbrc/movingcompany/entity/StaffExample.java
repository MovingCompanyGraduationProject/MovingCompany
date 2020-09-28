package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(String value) {
            addCriterion("userState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(String value) {
            addCriterion("userState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(String value) {
            addCriterion("userState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(String value) {
            addCriterion("userState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(String value) {
            addCriterion("userState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(String value) {
            addCriterion("userState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLike(String value) {
            addCriterion("userState like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotLike(String value) {
            addCriterion("userState not like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<String> values) {
            addCriterion("userState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<String> values) {
            addCriterion("userState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(String value1, String value2) {
            addCriterion("userState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(String value1, String value2) {
            addCriterion("userState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andDelstateIsNull() {
            addCriterion("delState is null");
            return (Criteria) this;
        }

        public Criteria andDelstateIsNotNull() {
            addCriterion("delState is not null");
            return (Criteria) this;
        }

        public Criteria andDelstateEqualTo(String value) {
            addCriterion("delState =", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotEqualTo(String value) {
            addCriterion("delState <>", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateGreaterThan(String value) {
            addCriterion("delState >", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateGreaterThanOrEqualTo(String value) {
            addCriterion("delState >=", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateLessThan(String value) {
            addCriterion("delState <", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateLessThanOrEqualTo(String value) {
            addCriterion("delState <=", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateLike(String value) {
            addCriterion("delState like", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotLike(String value) {
            addCriterion("delState not like", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateIn(List<String> values) {
            addCriterion("delState in", values, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotIn(List<String> values) {
            addCriterion("delState not in", values, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateBetween(String value1, String value2) {
            addCriterion("delState between", value1, value2, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotBetween(String value1, String value2) {
            addCriterion("delState not between", value1, value2, "delstate");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("updateTime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("updateTime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
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