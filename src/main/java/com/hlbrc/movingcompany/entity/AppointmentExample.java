package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentExample() {
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

        public Criteria andAppointmentidIsNull() {
            addCriterion("appointmentId is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentidIsNotNull() {
            addCriterion("appointmentId is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentidEqualTo(Integer value) {
            addCriterion("appointmentId =", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotEqualTo(Integer value) {
            addCriterion("appointmentId <>", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidGreaterThan(Integer value) {
            addCriterion("appointmentId >", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointmentId >=", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidLessThan(Integer value) {
            addCriterion("appointmentId <", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidLessThanOrEqualTo(Integer value) {
            addCriterion("appointmentId <=", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidIn(List<Integer> values) {
            addCriterion("appointmentId in", values, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotIn(List<Integer> values) {
            addCriterion("appointmentId not in", values, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidBetween(Integer value1, Integer value2) {
            addCriterion("appointmentId between", value1, value2, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("appointmentId not between", value1, value2, "appointmentid");
            return (Criteria) this;
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

        public Criteria andStartsiteIsNull() {
            addCriterion("startSite is null");
            return (Criteria) this;
        }

        public Criteria andStartsiteIsNotNull() {
            addCriterion("startSite is not null");
            return (Criteria) this;
        }

        public Criteria andStartsiteEqualTo(String value) {
            addCriterion("startSite =", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotEqualTo(String value) {
            addCriterion("startSite <>", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteGreaterThan(String value) {
            addCriterion("startSite >", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteGreaterThanOrEqualTo(String value) {
            addCriterion("startSite >=", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteLessThan(String value) {
            addCriterion("startSite <", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteLessThanOrEqualTo(String value) {
            addCriterion("startSite <=", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteLike(String value) {
            addCriterion("startSite like", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotLike(String value) {
            addCriterion("startSite not like", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteIn(List<String> values) {
            addCriterion("startSite in", values, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotIn(List<String> values) {
            addCriterion("startSite not in", values, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteBetween(String value1, String value2) {
            addCriterion("startSite between", value1, value2, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotBetween(String value1, String value2) {
            addCriterion("startSite not between", value1, value2, "startsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteIsNull() {
            addCriterion("endSite is null");
            return (Criteria) this;
        }

        public Criteria andEndsiteIsNotNull() {
            addCriterion("endSite is not null");
            return (Criteria) this;
        }

        public Criteria andEndsiteEqualTo(String value) {
            addCriterion("endSite =", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotEqualTo(String value) {
            addCriterion("endSite <>", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteGreaterThan(String value) {
            addCriterion("endSite >", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteGreaterThanOrEqualTo(String value) {
            addCriterion("endSite >=", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteLessThan(String value) {
            addCriterion("endSite <", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteLessThanOrEqualTo(String value) {
            addCriterion("endSite <=", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteLike(String value) {
            addCriterion("endSite like", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotLike(String value) {
            addCriterion("endSite not like", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteIn(List<String> values) {
            addCriterion("endSite in", values, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotIn(List<String> values) {
            addCriterion("endSite not in", values, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteBetween(String value1, String value2) {
            addCriterion("endSite between", value1, value2, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotBetween(String value1, String value2) {
            addCriterion("endSite not between", value1, value2, "endsite");
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMovingtimeIsNull() {
            addCriterion("movingTime is null");
            return (Criteria) this;
        }

        public Criteria andMovingtimeIsNotNull() {
            addCriterion("movingTime is not null");
            return (Criteria) this;
        }

        public Criteria andMovingtimeEqualTo(Date value) {
            addCriterion("movingTime =", value, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeNotEqualTo(Date value) {
            addCriterion("movingTime <>", value, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeGreaterThan(Date value) {
            addCriterion("movingTime >", value, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("movingTime >=", value, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeLessThan(Date value) {
            addCriterion("movingTime <", value, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeLessThanOrEqualTo(Date value) {
            addCriterion("movingTime <=", value, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeIn(List<Date> values) {
            addCriterion("movingTime in", values, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeNotIn(List<Date> values) {
            addCriterion("movingTime not in", values, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeBetween(Date value1, Date value2) {
            addCriterion("movingTime between", value1, value2, "movingtime");
            return (Criteria) this;
        }

        public Criteria andMovingtimeNotBetween(Date value1, Date value2) {
            addCriterion("movingTime not between", value1, value2, "movingtime");
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