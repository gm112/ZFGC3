package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class bbCodeAttributeDbObjExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public bbCodeAttributeDbObjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
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
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
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

        public Criteria andBbCodeAttributeIdIsNull() {
            addCriterion("BB_CODE_ATTRIBUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdIsNotNull() {
            addCriterion("BB_CODE_ATTRIBUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdEqualTo(Integer value) {
            addCriterion("BB_CODE_ATTRIBUTE_ID =", value, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdNotEqualTo(Integer value) {
            addCriterion("BB_CODE_ATTRIBUTE_ID <>", value, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdGreaterThan(Integer value) {
            addCriterion("BB_CODE_ATTRIBUTE_ID >", value, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BB_CODE_ATTRIBUTE_ID >=", value, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdLessThan(Integer value) {
            addCriterion("BB_CODE_ATTRIBUTE_ID <", value, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BB_CODE_ATTRIBUTE_ID <=", value, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdIn(List<Integer> values) {
            addCriterion("BB_CODE_ATTRIBUTE_ID in", values, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdNotIn(List<Integer> values) {
            addCriterion("BB_CODE_ATTRIBUTE_ID not in", values, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdBetween(Integer value1, Integer value2) {
            addCriterion("BB_CODE_ATTRIBUTE_ID between", value1, value2, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BB_CODE_ATTRIBUTE_ID not between", value1, value2, "bbCodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeIsNull() {
            addCriterion("ATTRIBUTE_DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeIsNotNull() {
            addCriterion("ATTRIBUTE_DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeEqualTo(Integer value) {
            addCriterion("ATTRIBUTE_DATA_TYPE =", value, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeNotEqualTo(Integer value) {
            addCriterion("ATTRIBUTE_DATA_TYPE <>", value, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeGreaterThan(Integer value) {
            addCriterion("ATTRIBUTE_DATA_TYPE >", value, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTRIBUTE_DATA_TYPE >=", value, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeLessThan(Integer value) {
            addCriterion("ATTRIBUTE_DATA_TYPE <", value, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ATTRIBUTE_DATA_TYPE <=", value, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeIn(List<Integer> values) {
            addCriterion("ATTRIBUTE_DATA_TYPE in", values, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeNotIn(List<Integer> values) {
            addCriterion("ATTRIBUTE_DATA_TYPE not in", values, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("ATTRIBUTE_DATA_TYPE between", value1, value2, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ATTRIBUTE_DATA_TYPE not between", value1, value2, "attributeDataType");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexIsNull() {
            addCriterion("ATTRIBUTE_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexIsNotNull() {
            addCriterion("ATTRIBUTE_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexEqualTo(Byte value) {
            addCriterion("ATTRIBUTE_INDEX =", value, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexNotEqualTo(Byte value) {
            addCriterion("ATTRIBUTE_INDEX <>", value, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexGreaterThan(Byte value) {
            addCriterion("ATTRIBUTE_INDEX >", value, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("ATTRIBUTE_INDEX >=", value, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexLessThan(Byte value) {
            addCriterion("ATTRIBUTE_INDEX <", value, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexLessThanOrEqualTo(Byte value) {
            addCriterion("ATTRIBUTE_INDEX <=", value, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexIn(List<Byte> values) {
            addCriterion("ATTRIBUTE_INDEX in", values, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexNotIn(List<Byte> values) {
            addCriterion("ATTRIBUTE_INDEX not in", values, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexBetween(Byte value1, Byte value2) {
            addCriterion("ATTRIBUTE_INDEX between", value1, value2, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andAttributeIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("ATTRIBUTE_INDEX not between", value1, value2, "attributeIndex");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdIsNull() {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdIsNotNull() {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdEqualTo(Byte value) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID =", value, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdNotEqualTo(Byte value) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID <>", value, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdGreaterThan(Byte value) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID >", value, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID >=", value, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdLessThan(Byte value) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID <", value, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdLessThanOrEqualTo(Byte value) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID <=", value, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdIn(List<Byte> values) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID in", values, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdNotIn(List<Byte> values) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID not in", values, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdBetween(Byte value1, Byte value2) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID between", value1, value2, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andBbCodeAttributeModeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("BB_CODE_ATTRIBUTE_MODE_ID not between", value1, value2, "bbCodeAttributeModeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated do_not_delete_during_merge Fri Jun 02 22:45:29 EDT 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BB_CODE_ATTRIBUTE
     *
     * @mbg.generated Fri Jun 02 22:45:29 EDT 2017
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