package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class IpAddressDbObjExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public IpAddressDbObjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
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

        public Criteria andIpAddressIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("IP_ADDRESS like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Byte value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Byte value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Byte value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Byte value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Byte value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Byte value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Byte> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Byte> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Byte value1, Byte value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Byte value1, Byte value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagIsNull() {
            addCriterion("IS_SPAMMER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagIsNotNull() {
            addCriterion("IS_SPAMMER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagEqualTo(Boolean value) {
            addCriterion("IS_SPAMMER_FLAG =", value, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagNotEqualTo(Boolean value) {
            addCriterion("IS_SPAMMER_FLAG <>", value, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagGreaterThan(Boolean value) {
            addCriterion("IS_SPAMMER_FLAG >", value, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_SPAMMER_FLAG >=", value, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagLessThan(Boolean value) {
            addCriterion("IS_SPAMMER_FLAG <", value, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_SPAMMER_FLAG <=", value, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagIn(List<Boolean> values) {
            addCriterion("IS_SPAMMER_FLAG in", values, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagNotIn(List<Boolean> values) {
            addCriterion("IS_SPAMMER_FLAG not in", values, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SPAMMER_FLAG between", value1, value2, "isSpammerFlag");
            return (Criteria) this;
        }

        public Criteria andIsSpammerFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SPAMMER_FLAG not between", value1, value2, "isSpammerFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 03 12:42:31 EDT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IP_ADDRESS
     *
     * @mbggenerated Thu Nov 03 12:42:31 EDT 2016
     */
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