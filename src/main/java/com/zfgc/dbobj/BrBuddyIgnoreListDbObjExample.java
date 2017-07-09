package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class BrBuddyIgnoreListDbObjExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public BrBuddyIgnoreListDbObjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
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
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
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

        public Criteria andUserAIdIsNull() {
            addCriterion("USER_A_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserAIdIsNotNull() {
            addCriterion("USER_A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserAIdEqualTo(Integer value) {
            addCriterion("USER_A_ID =", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdNotEqualTo(Integer value) {
            addCriterion("USER_A_ID <>", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdGreaterThan(Integer value) {
            addCriterion("USER_A_ID >", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_A_ID >=", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdLessThan(Integer value) {
            addCriterion("USER_A_ID <", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_A_ID <=", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdIn(List<Integer> values) {
            addCriterion("USER_A_ID in", values, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdNotIn(List<Integer> values) {
            addCriterion("USER_A_ID not in", values, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_A_ID between", value1, value2, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_A_ID not between", value1, value2, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserBIdIsNull() {
            addCriterion("USER_B_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserBIdIsNotNull() {
            addCriterion("USER_B_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserBIdEqualTo(Integer value) {
            addCriterion("USER_B_ID =", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdNotEqualTo(Integer value) {
            addCriterion("USER_B_ID <>", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdGreaterThan(Integer value) {
            addCriterion("USER_B_ID >", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_B_ID >=", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdLessThan(Integer value) {
            addCriterion("USER_B_ID <", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_B_ID <=", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdIn(List<Integer> values) {
            addCriterion("USER_B_ID in", values, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdNotIn(List<Integer> values) {
            addCriterion("USER_B_ID not in", values, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_B_ID between", value1, value2, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_B_ID not between", value1, value2, "userBId");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagIsNull() {
            addCriterion("BUDDY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagIsNotNull() {
            addCriterion("BUDDY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagEqualTo(Boolean value) {
            addCriterion("BUDDY_FLAG =", value, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagNotEqualTo(Boolean value) {
            addCriterion("BUDDY_FLAG <>", value, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagGreaterThan(Boolean value) {
            addCriterion("BUDDY_FLAG >", value, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BUDDY_FLAG >=", value, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagLessThan(Boolean value) {
            addCriterion("BUDDY_FLAG <", value, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("BUDDY_FLAG <=", value, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagIn(List<Boolean> values) {
            addCriterion("BUDDY_FLAG in", values, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagNotIn(List<Boolean> values) {
            addCriterion("BUDDY_FLAG not in", values, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("BUDDY_FLAG between", value1, value2, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andBuddyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BUDDY_FLAG not between", value1, value2, "buddyFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagIsNull() {
            addCriterion("IGNORE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagIsNotNull() {
            addCriterion("IGNORE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagEqualTo(Boolean value) {
            addCriterion("IGNORE_FLAG =", value, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagNotEqualTo(Boolean value) {
            addCriterion("IGNORE_FLAG <>", value, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagGreaterThan(Boolean value) {
            addCriterion("IGNORE_FLAG >", value, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IGNORE_FLAG >=", value, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagLessThan(Boolean value) {
            addCriterion("IGNORE_FLAG <", value, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("IGNORE_FLAG <=", value, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagIn(List<Boolean> values) {
            addCriterion("IGNORE_FLAG in", values, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagNotIn(List<Boolean> values) {
            addCriterion("IGNORE_FLAG not in", values, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("IGNORE_FLAG between", value1, value2, "ignoreFlag");
            return (Criteria) this;
        }

        public Criteria andIgnoreFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IGNORE_FLAG not between", value1, value2, "ignoreFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated do_not_delete_during_merge Sun Jul 09 00:52:33 EDT 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BR_BUDDY_IGNORE_LIST
     *
     * @mbggenerated Sun Jul 09 00:52:33 EDT 2017
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