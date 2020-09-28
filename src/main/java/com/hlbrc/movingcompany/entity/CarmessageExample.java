package com.hlbrc.movingcompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarmessageExample() {
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

        public Criteria andCarmessageidIsNull() {
            addCriterion("carMessageId is null");
            return (Criteria) this;
        }

        public Criteria andCarmessageidIsNotNull() {
            addCriterion("carMessageId is not null");
            return (Criteria) this;
        }

        public Criteria andCarmessageidEqualTo(Integer value) {
            addCriterion("carMessageId =", value, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidNotEqualTo(Integer value) {
            addCriterion("carMessageId <>", value, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidGreaterThan(Integer value) {
            addCriterion("carMessageId >", value, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carMessageId >=", value, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidLessThan(Integer value) {
            addCriterion("carMessageId <", value, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidLessThanOrEqualTo(Integer value) {
            addCriterion("carMessageId <=", value, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidIn(List<Integer> values) {
            addCriterion("carMessageId in", values, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidNotIn(List<Integer> values) {
            addCriterion("carMessageId not in", values, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidBetween(Integer value1, Integer value2) {
            addCriterion("carMessageId between", value1, value2, "carmessageid");
            return (Criteria) this;
        }

        public Criteria andCarmessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("carMessageId not between", value1, value2, "carmessageid");
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

        public Criteria andCartypeidIsNull() {
            addCriterion("carTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCartypeidIsNotNull() {
            addCriterion("carTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeidEqualTo(Integer value) {
            addCriterion("carTypeId =", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotEqualTo(Integer value) {
            addCriterion("carTypeId <>", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThan(Integer value) {
            addCriterion("carTypeId >", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carTypeId >=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThan(Integer value) {
            addCriterion("carTypeId <", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThanOrEqualTo(Integer value) {
            addCriterion("carTypeId <=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidIn(List<Integer> values) {
            addCriterion("carTypeId in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotIn(List<Integer> values) {
            addCriterion("carTypeId not in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidBetween(Integer value1, Integer value2) {
            addCriterion("carTypeId between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("carTypeId not between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCustomnumIsNull() {
            addCriterion("customNum is null");
            return (Criteria) this;
        }

        public Criteria andCustomnumIsNotNull() {
            addCriterion("customNum is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnumEqualTo(String value) {
            addCriterion("customNum =", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumNotEqualTo(String value) {
            addCriterion("customNum <>", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumGreaterThan(String value) {
            addCriterion("customNum >", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumGreaterThanOrEqualTo(String value) {
            addCriterion("customNum >=", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumLessThan(String value) {
            addCriterion("customNum <", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumLessThanOrEqualTo(String value) {
            addCriterion("customNum <=", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumLike(String value) {
            addCriterion("customNum like", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumNotLike(String value) {
            addCriterion("customNum not like", value, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumIn(List<String> values) {
            addCriterion("customNum in", values, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumNotIn(List<String> values) {
            addCriterion("customNum not in", values, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumBetween(String value1, String value2) {
            addCriterion("customNum between", value1, value2, "customnum");
            return (Criteria) this;
        }

        public Criteria andCustomnumNotBetween(String value1, String value2) {
            addCriterion("customNum not between", value1, value2, "customnum");
            return (Criteria) this;
        }

        public Criteria andLicensenumIsNull() {
            addCriterion("licenseNum is null");
            return (Criteria) this;
        }

        public Criteria andLicensenumIsNotNull() {
            addCriterion("licenseNum is not null");
            return (Criteria) this;
        }

        public Criteria andLicensenumEqualTo(String value) {
            addCriterion("licenseNum =", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotEqualTo(String value) {
            addCriterion("licenseNum <>", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumGreaterThan(String value) {
            addCriterion("licenseNum >", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumGreaterThanOrEqualTo(String value) {
            addCriterion("licenseNum >=", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumLessThan(String value) {
            addCriterion("licenseNum <", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumLessThanOrEqualTo(String value) {
            addCriterion("licenseNum <=", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumLike(String value) {
            addCriterion("licenseNum like", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotLike(String value) {
            addCriterion("licenseNum not like", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumIn(List<String> values) {
            addCriterion("licenseNum in", values, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotIn(List<String> values) {
            addCriterion("licenseNum not in", values, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumBetween(String value1, String value2) {
            addCriterion("licenseNum between", value1, value2, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotBetween(String value1, String value2) {
            addCriterion("licenseNum not between", value1, value2, "licensenum");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andGpsnumIsNull() {
            addCriterion("GPSNum is null");
            return (Criteria) this;
        }

        public Criteria andGpsnumIsNotNull() {
            addCriterion("GPSNum is not null");
            return (Criteria) this;
        }

        public Criteria andGpsnumEqualTo(String value) {
            addCriterion("GPSNum =", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumNotEqualTo(String value) {
            addCriterion("GPSNum <>", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumGreaterThan(String value) {
            addCriterion("GPSNum >", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumGreaterThanOrEqualTo(String value) {
            addCriterion("GPSNum >=", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumLessThan(String value) {
            addCriterion("GPSNum <", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumLessThanOrEqualTo(String value) {
            addCriterion("GPSNum <=", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumLike(String value) {
            addCriterion("GPSNum like", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumNotLike(String value) {
            addCriterion("GPSNum not like", value, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumIn(List<String> values) {
            addCriterion("GPSNum in", values, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumNotIn(List<String> values) {
            addCriterion("GPSNum not in", values, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumBetween(String value1, String value2) {
            addCriterion("GPSNum between", value1, value2, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andGpsnumNotBetween(String value1, String value2) {
            addCriterion("GPSNum not between", value1, value2, "gpsnum");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNull() {
            addCriterion("tonnage is null");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNotNull() {
            addCriterion("tonnage is not null");
            return (Criteria) this;
        }

        public Criteria andTonnageEqualTo(Double value) {
            addCriterion("tonnage =", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotEqualTo(Double value) {
            addCriterion("tonnage <>", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThan(Double value) {
            addCriterion("tonnage >", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThanOrEqualTo(Double value) {
            addCriterion("tonnage >=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThan(Double value) {
            addCriterion("tonnage <", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThanOrEqualTo(Double value) {
            addCriterion("tonnage <=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageIn(List<Double> values) {
            addCriterion("tonnage in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotIn(List<Double> values) {
            addCriterion("tonnage not in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageBetween(Double value1, Double value2) {
            addCriterion("tonnage between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotBetween(Double value1, Double value2) {
            addCriterion("tonnage not between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNull() {
            addCriterion("carState is null");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNotNull() {
            addCriterion("carState is not null");
            return (Criteria) this;
        }

        public Criteria andCarstateEqualTo(String value) {
            addCriterion("carState =", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotEqualTo(String value) {
            addCriterion("carState <>", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThan(String value) {
            addCriterion("carState >", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThanOrEqualTo(String value) {
            addCriterion("carState >=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThan(String value) {
            addCriterion("carState <", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThanOrEqualTo(String value) {
            addCriterion("carState <=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLike(String value) {
            addCriterion("carState like", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotLike(String value) {
            addCriterion("carState not like", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateIn(List<String> values) {
            addCriterion("carState in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotIn(List<String> values) {
            addCriterion("carState not in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateBetween(String value1, String value2) {
            addCriterion("carState between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotBetween(String value1, String value2) {
            addCriterion("carState not between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
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