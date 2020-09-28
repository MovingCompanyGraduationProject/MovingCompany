package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.List;

public class AppraiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppraiseExample() {
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

        public Criteria andAppraiseidIsNull() {
            addCriterion("appraiseId is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseidIsNotNull() {
            addCriterion("appraiseId is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseidEqualTo(Integer value) {
            addCriterion("appraiseId =", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotEqualTo(Integer value) {
            addCriterion("appraiseId <>", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidGreaterThan(Integer value) {
            addCriterion("appraiseId >", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraiseId >=", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidLessThan(Integer value) {
            addCriterion("appraiseId <", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidLessThanOrEqualTo(Integer value) {
            addCriterion("appraiseId <=", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidIn(List<Integer> values) {
            addCriterion("appraiseId in", values, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotIn(List<Integer> values) {
            addCriterion("appraiseId not in", values, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidBetween(Integer value1, Integer value2) {
            addCriterion("appraiseId between", value1, value2, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotBetween(Integer value1, Integer value2) {
            addCriterion("appraiseId not between", value1, value2, "appraiseid");
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

        public Criteria andOverallmeritIsNull() {
            addCriterion("overallMerit is null");
            return (Criteria) this;
        }

        public Criteria andOverallmeritIsNotNull() {
            addCriterion("overallMerit is not null");
            return (Criteria) this;
        }

        public Criteria andOverallmeritEqualTo(String value) {
            addCriterion("overallMerit =", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritNotEqualTo(String value) {
            addCriterion("overallMerit <>", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritGreaterThan(String value) {
            addCriterion("overallMerit >", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritGreaterThanOrEqualTo(String value) {
            addCriterion("overallMerit >=", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritLessThan(String value) {
            addCriterion("overallMerit <", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritLessThanOrEqualTo(String value) {
            addCriterion("overallMerit <=", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritLike(String value) {
            addCriterion("overallMerit like", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritNotLike(String value) {
            addCriterion("overallMerit not like", value, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritIn(List<String> values) {
            addCriterion("overallMerit in", values, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritNotIn(List<String> values) {
            addCriterion("overallMerit not in", values, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritBetween(String value1, String value2) {
            addCriterion("overallMerit between", value1, value2, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andOverallmeritNotBetween(String value1, String value2) {
            addCriterion("overallMerit not between", value1, value2, "overallmerit");
            return (Criteria) this;
        }

        public Criteria andMannerIsNull() {
            addCriterion("manner is null");
            return (Criteria) this;
        }

        public Criteria andMannerIsNotNull() {
            addCriterion("manner is not null");
            return (Criteria) this;
        }

        public Criteria andMannerEqualTo(String value) {
            addCriterion("manner =", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerNotEqualTo(String value) {
            addCriterion("manner <>", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerGreaterThan(String value) {
            addCriterion("manner >", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerGreaterThanOrEqualTo(String value) {
            addCriterion("manner >=", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerLessThan(String value) {
            addCriterion("manner <", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerLessThanOrEqualTo(String value) {
            addCriterion("manner <=", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerLike(String value) {
            addCriterion("manner like", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerNotLike(String value) {
            addCriterion("manner not like", value, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerIn(List<String> values) {
            addCriterion("manner in", values, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerNotIn(List<String> values) {
            addCriterion("manner not in", values, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerBetween(String value1, String value2) {
            addCriterion("manner between", value1, value2, "manner");
            return (Criteria) this;
        }

        public Criteria andMannerNotBetween(String value1, String value2) {
            addCriterion("manner not between", value1, value2, "manner");
            return (Criteria) this;
        }

        public Criteria andFiducialpointIsNull() {
            addCriterion("fiducialPoint is null");
            return (Criteria) this;
        }

        public Criteria andFiducialpointIsNotNull() {
            addCriterion("fiducialPoint is not null");
            return (Criteria) this;
        }

        public Criteria andFiducialpointEqualTo(String value) {
            addCriterion("fiducialPoint =", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointNotEqualTo(String value) {
            addCriterion("fiducialPoint <>", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointGreaterThan(String value) {
            addCriterion("fiducialPoint >", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointGreaterThanOrEqualTo(String value) {
            addCriterion("fiducialPoint >=", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointLessThan(String value) {
            addCriterion("fiducialPoint <", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointLessThanOrEqualTo(String value) {
            addCriterion("fiducialPoint <=", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointLike(String value) {
            addCriterion("fiducialPoint like", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointNotLike(String value) {
            addCriterion("fiducialPoint not like", value, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointIn(List<String> values) {
            addCriterion("fiducialPoint in", values, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointNotIn(List<String> values) {
            addCriterion("fiducialPoint not in", values, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointBetween(String value1, String value2) {
            addCriterion("fiducialPoint between", value1, value2, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andFiducialpointNotBetween(String value1, String value2) {
            addCriterion("fiducialPoint not between", value1, value2, "fiducialpoint");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionIsNull() {
            addCriterion("vehicleCondition is null");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionIsNotNull() {
            addCriterion("vehicleCondition is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionEqualTo(String value) {
            addCriterion("vehicleCondition =", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionNotEqualTo(String value) {
            addCriterion("vehicleCondition <>", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionGreaterThan(String value) {
            addCriterion("vehicleCondition >", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleCondition >=", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionLessThan(String value) {
            addCriterion("vehicleCondition <", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionLessThanOrEqualTo(String value) {
            addCriterion("vehicleCondition <=", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionLike(String value) {
            addCriterion("vehicleCondition like", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionNotLike(String value) {
            addCriterion("vehicleCondition not like", value, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionIn(List<String> values) {
            addCriterion("vehicleCondition in", values, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionNotIn(List<String> values) {
            addCriterion("vehicleCondition not in", values, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionBetween(String value1, String value2) {
            addCriterion("vehicleCondition between", value1, value2, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andVehicleconditionNotBetween(String value1, String value2) {
            addCriterion("vehicleCondition not between", value1, value2, "vehiclecondition");
            return (Criteria) this;
        }

        public Criteria andContextcodeIsNull() {
            addCriterion("contextCode is null");
            return (Criteria) this;
        }

        public Criteria andContextcodeIsNotNull() {
            addCriterion("contextCode is not null");
            return (Criteria) this;
        }

        public Criteria andContextcodeEqualTo(String value) {
            addCriterion("contextCode =", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeNotEqualTo(String value) {
            addCriterion("contextCode <>", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeGreaterThan(String value) {
            addCriterion("contextCode >", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeGreaterThanOrEqualTo(String value) {
            addCriterion("contextCode >=", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeLessThan(String value) {
            addCriterion("contextCode <", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeLessThanOrEqualTo(String value) {
            addCriterion("contextCode <=", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeLike(String value) {
            addCriterion("contextCode like", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeNotLike(String value) {
            addCriterion("contextCode not like", value, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeIn(List<String> values) {
            addCriterion("contextCode in", values, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeNotIn(List<String> values) {
            addCriterion("contextCode not in", values, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeBetween(String value1, String value2) {
            addCriterion("contextCode between", value1, value2, "contextcode");
            return (Criteria) this;
        }

        public Criteria andContextcodeNotBetween(String value1, String value2) {
            addCriterion("contextCode not between", value1, value2, "contextcode");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeIsNull() {
            addCriterion("appraiseType is null");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeIsNotNull() {
            addCriterion("appraiseType is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeEqualTo(String value) {
            addCriterion("appraiseType =", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeNotEqualTo(String value) {
            addCriterion("appraiseType <>", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeGreaterThan(String value) {
            addCriterion("appraiseType >", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeGreaterThanOrEqualTo(String value) {
            addCriterion("appraiseType >=", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeLessThan(String value) {
            addCriterion("appraiseType <", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeLessThanOrEqualTo(String value) {
            addCriterion("appraiseType <=", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeLike(String value) {
            addCriterion("appraiseType like", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeNotLike(String value) {
            addCriterion("appraiseType not like", value, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeIn(List<String> values) {
            addCriterion("appraiseType in", values, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeNotIn(List<String> values) {
            addCriterion("appraiseType not in", values, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeBetween(String value1, String value2) {
            addCriterion("appraiseType between", value1, value2, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andAppraisetypeNotBetween(String value1, String value2) {
            addCriterion("appraiseType not between", value1, value2, "appraisetype");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNull() {
            addCriterion("likeNum is null");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNotNull() {
            addCriterion("likeNum is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumEqualTo(Integer value) {
            addCriterion("likeNum =", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotEqualTo(Integer value) {
            addCriterion("likeNum <>", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThan(Integer value) {
            addCriterion("likeNum >", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeNum >=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThan(Integer value) {
            addCriterion("likeNum <", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("likeNum <=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumIn(List<Integer> values) {
            addCriterion("likeNum in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotIn(List<Integer> values) {
            addCriterion("likeNum not in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumBetween(Integer value1, Integer value2) {
            addCriterion("likeNum between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("likeNum not between", value1, value2, "likenum");
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