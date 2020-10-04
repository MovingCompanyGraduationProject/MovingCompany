package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveWordExample() {
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

        public Criteria andLeavewordidIsNull() {
            addCriterion("leaveWordId is null");
            return (Criteria) this;
        }

        public Criteria andLeavewordidIsNotNull() {
            addCriterion("leaveWordId is not null");
            return (Criteria) this;
        }

        public Criteria andLeavewordidEqualTo(Integer value) {
            addCriterion("leaveWordId =", value, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidNotEqualTo(Integer value) {
            addCriterion("leaveWordId <>", value, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidGreaterThan(Integer value) {
            addCriterion("leaveWordId >", value, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveWordId >=", value, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidLessThan(Integer value) {
            addCriterion("leaveWordId <", value, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidLessThanOrEqualTo(Integer value) {
            addCriterion("leaveWordId <=", value, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidIn(List<Integer> values) {
            addCriterion("leaveWordId in", values, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidNotIn(List<Integer> values) {
            addCriterion("leaveWordId not in", values, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidBetween(Integer value1, Integer value2) {
            addCriterion("leaveWordId between", value1, value2, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andLeavewordidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveWordId not between", value1, value2, "leavewordid");
            return (Criteria) this;
        }

        public Criteria andCorporationnameIsNull() {
            addCriterion("corporationName is null");
            return (Criteria) this;
        }

        public Criteria andCorporationnameIsNotNull() {
            addCriterion("corporationName is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationnameEqualTo(String value) {
            addCriterion("corporationName =", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotEqualTo(String value) {
            addCriterion("corporationName <>", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameGreaterThan(String value) {
            addCriterion("corporationName >", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameGreaterThanOrEqualTo(String value) {
            addCriterion("corporationName >=", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameLessThan(String value) {
            addCriterion("corporationName <", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameLessThanOrEqualTo(String value) {
            addCriterion("corporationName <=", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameLike(String value) {
            addCriterion("corporationName like", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotLike(String value) {
            addCriterion("corporationName not like", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameIn(List<String> values) {
            addCriterion("corporationName in", values, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotIn(List<String> values) {
            addCriterion("corporationName not in", values, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameBetween(String value1, String value2) {
            addCriterion("corporationName between", value1, value2, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotBetween(String value1, String value2) {
            addCriterion("corporationName not between", value1, value2, "corporationname");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkMan not between", value1, value2, "linkman");
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

        public Criteria andWechatidIsNull() {
            addCriterion("weChatId is null");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNotNull() {
            addCriterion("weChatId is not null");
            return (Criteria) this;
        }

        public Criteria andWechatidEqualTo(String value) {
            addCriterion("weChatId =", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotEqualTo(String value) {
            addCriterion("weChatId <>", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThan(String value) {
            addCriterion("weChatId >", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThanOrEqualTo(String value) {
            addCriterion("weChatId >=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThan(String value) {
            addCriterion("weChatId <", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThanOrEqualTo(String value) {
            addCriterion("weChatId <=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLike(String value) {
            addCriterion("weChatId like", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotLike(String value) {
            addCriterion("weChatId not like", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidIn(List<String> values) {
            addCriterion("weChatId in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotIn(List<String> values) {
            addCriterion("weChatId not in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidBetween(String value1, String value2) {
            addCriterion("weChatId between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotBetween(String value1, String value2) {
            addCriterion("weChatId not between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIsNull() {
            addCriterion("leaveMessage is null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIsNotNull() {
            addCriterion("leaveMessage is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemessageEqualTo(String value) {
            addCriterion("leaveMessage =", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageNotEqualTo(String value) {
            addCriterion("leaveMessage <>", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageGreaterThan(String value) {
            addCriterion("leaveMessage >", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageGreaterThanOrEqualTo(String value) {
            addCriterion("leaveMessage >=", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLessThan(String value) {
            addCriterion("leaveMessage <", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLessThanOrEqualTo(String value) {
            addCriterion("leaveMessage <=", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageLike(String value) {
            addCriterion("leaveMessage like", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageNotLike(String value) {
            addCriterion("leaveMessage not like", value, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageIn(List<String> values) {
            addCriterion("leaveMessage in", values, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageNotIn(List<String> values) {
            addCriterion("leaveMessage not in", values, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageBetween(String value1, String value2) {
            addCriterion("leaveMessage between", value1, value2, "leavemessage");
            return (Criteria) this;
        }

        public Criteria andLeavemessageNotBetween(String value1, String value2) {
            addCriterion("leaveMessage not between", value1, value2, "leavemessage");
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