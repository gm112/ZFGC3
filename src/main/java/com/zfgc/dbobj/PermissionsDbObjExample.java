package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class PermissionsDbObjExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public PermissionsDbObjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
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
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
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

        public Criteria andPermissionsIdIsNull() {
            addCriterion("PERMISSIONS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdIsNotNull() {
            addCriterion("PERMISSIONS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdEqualTo(Integer value) {
            addCriterion("PERMISSIONS_ID =", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdNotEqualTo(Integer value) {
            addCriterion("PERMISSIONS_ID <>", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdGreaterThan(Integer value) {
            addCriterion("PERMISSIONS_ID >", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERMISSIONS_ID >=", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdLessThan(Integer value) {
            addCriterion("PERMISSIONS_ID <", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("PERMISSIONS_ID <=", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdIn(List<Integer> values) {
            addCriterion("PERMISSIONS_ID in", values, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdNotIn(List<Integer> values) {
            addCriterion("PERMISSIONS_ID not in", values, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSIONS_ID between", value1, value2, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSIONS_ID not between", value1, value2, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeIsNull() {
            addCriterion("PERMISSIONS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeIsNotNull() {
            addCriterion("PERMISSIONS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeEqualTo(String value) {
            addCriterion("PERMISSIONS_CODE =", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotEqualTo(String value) {
            addCriterion("PERMISSIONS_CODE <>", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeGreaterThan(String value) {
            addCriterion("PERMISSIONS_CODE >", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONS_CODE >=", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeLessThan(String value) {
            addCriterion("PERMISSIONS_CODE <", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONS_CODE <=", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeLike(String value) {
            addCriterion("PERMISSIONS_CODE like", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotLike(String value) {
            addCriterion("PERMISSIONS_CODE not like", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeIn(List<String> values) {
            addCriterion("PERMISSIONS_CODE in", values, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotIn(List<String> values) {
            addCriterion("PERMISSIONS_CODE not in", values, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeBetween(String value1, String value2) {
            addCriterion("PERMISSIONS_CODE between", value1, value2, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONS_CODE not between", value1, value2, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescIsNull() {
            addCriterion("PERMISSIONS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescIsNotNull() {
            addCriterion("PERMISSIONS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescEqualTo(String value) {
            addCriterion("PERMISSIONS_DESC =", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescNotEqualTo(String value) {
            addCriterion("PERMISSIONS_DESC <>", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescGreaterThan(String value) {
            addCriterion("PERMISSIONS_DESC >", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONS_DESC >=", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescLessThan(String value) {
            addCriterion("PERMISSIONS_DESC <", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONS_DESC <=", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescLike(String value) {
            addCriterion("PERMISSIONS_DESC like", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescNotLike(String value) {
            addCriterion("PERMISSIONS_DESC not like", value, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescIn(List<String> values) {
            addCriterion("PERMISSIONS_DESC in", values, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescNotIn(List<String> values) {
            addCriterion("PERMISSIONS_DESC not in", values, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescBetween(String value1, String value2) {
            addCriterion("PERMISSIONS_DESC between", value1, value2, "permissionsDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionsDescNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONS_DESC not between", value1, value2, "permissionsDesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PERMISSIONS
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 24 17:30:13 EDT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PERMISSIONS
     *
     * @mbggenerated Sun Mar 24 17:30:13 EDT 2019
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