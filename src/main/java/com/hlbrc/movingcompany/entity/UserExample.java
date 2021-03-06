package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
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

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
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

        public Criteria andUsertelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("userTel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("userTel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("userTel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("userTel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("userTel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("userTel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andIdcardzIsNull() {
            addCriterion("idCardZ is null");
            return (Criteria) this;
        }

        public Criteria andIdcardzIsNotNull() {
            addCriterion("idCardZ is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardzEqualTo(String value) {
            addCriterion("idCardZ =", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzNotEqualTo(String value) {
            addCriterion("idCardZ <>", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzGreaterThan(String value) {
            addCriterion("idCardZ >", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzGreaterThanOrEqualTo(String value) {
            addCriterion("idCardZ >=", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzLessThan(String value) {
            addCriterion("idCardZ <", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzLessThanOrEqualTo(String value) {
            addCriterion("idCardZ <=", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzLike(String value) {
            addCriterion("idCardZ like", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzNotLike(String value) {
            addCriterion("idCardZ not like", value, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzIn(List<String> values) {
            addCriterion("idCardZ in", values, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzNotIn(List<String> values) {
            addCriterion("idCardZ not in", values, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzBetween(String value1, String value2) {
            addCriterion("idCardZ between", value1, value2, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardzNotBetween(String value1, String value2) {
            addCriterion("idCardZ not between", value1, value2, "idcardz");
            return (Criteria) this;
        }

        public Criteria andIdcardfIsNull() {
            addCriterion("IdCardF is null");
            return (Criteria) this;
        }

        public Criteria andIdcardfIsNotNull() {
            addCriterion("IdCardF is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardfEqualTo(String value) {
            addCriterion("IdCardF =", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfNotEqualTo(String value) {
            addCriterion("IdCardF <>", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfGreaterThan(String value) {
            addCriterion("IdCardF >", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfGreaterThanOrEqualTo(String value) {
            addCriterion("IdCardF >=", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfLessThan(String value) {
            addCriterion("IdCardF <", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfLessThanOrEqualTo(String value) {
            addCriterion("IdCardF <=", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfLike(String value) {
            addCriterion("IdCardF like", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfNotLike(String value) {
            addCriterion("IdCardF not like", value, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfIn(List<String> values) {
            addCriterion("IdCardF in", values, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfNotIn(List<String> values) {
            addCriterion("IdCardF not in", values, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfBetween(String value1, String value2) {
            addCriterion("IdCardF between", value1, value2, "idcardf");
            return (Criteria) this;
        }

        public Criteria andIdcardfNotBetween(String value1, String value2) {
            addCriterion("IdCardF not between", value1, value2, "idcardf");
            return (Criteria) this;
        }

        public Criteria andApprovestateIsNull() {
            addCriterion("approveState is null");
            return (Criteria) this;
        }

        public Criteria andApprovestateIsNotNull() {
            addCriterion("approveState is not null");
            return (Criteria) this;
        }

        public Criteria andApprovestateEqualTo(String value) {
            addCriterion("approveState =", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateNotEqualTo(String value) {
            addCriterion("approveState <>", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateGreaterThan(String value) {
            addCriterion("approveState >", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateGreaterThanOrEqualTo(String value) {
            addCriterion("approveState >=", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateLessThan(String value) {
            addCriterion("approveState <", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateLessThanOrEqualTo(String value) {
            addCriterion("approveState <=", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateLike(String value) {
            addCriterion("approveState like", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateNotLike(String value) {
            addCriterion("approveState not like", value, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateIn(List<String> values) {
            addCriterion("approveState in", values, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateNotIn(List<String> values) {
            addCriterion("approveState not in", values, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateBetween(String value1, String value2) {
            addCriterion("approveState between", value1, value2, "approvestate");
            return (Criteria) this;
        }

        public Criteria andApprovestateNotBetween(String value1, String value2) {
            addCriterion("approveState not between", value1, value2, "approvestate");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNull() {
            addCriterion("userphoto is null");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNotNull() {
            addCriterion("userphoto is not null");
            return (Criteria) this;
        }

        public Criteria andUserphotoEqualTo(String value) {
            addCriterion("userphoto =", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotEqualTo(String value) {
            addCriterion("userphoto <>", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThan(String value) {
            addCriterion("userphoto >", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThanOrEqualTo(String value) {
            addCriterion("userphoto >=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThan(String value) {
            addCriterion("userphoto <", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThanOrEqualTo(String value) {
            addCriterion("userphoto <=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLike(String value) {
            addCriterion("userphoto like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotLike(String value) {
            addCriterion("userphoto not like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoIn(List<String> values) {
            addCriterion("userphoto in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotIn(List<String> values) {
            addCriterion("userphoto not in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoBetween(String value1, String value2) {
            addCriterion("userphoto between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotBetween(String value1, String value2) {
            addCriterion("userphoto not between", value1, value2, "userphoto");
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