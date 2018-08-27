package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class BrUserConversationDbObjExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public BrUserConversationDbObjExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUsersIdIsNull() {
			addCriterion("USERS_ID is null");
			return (Criteria) this;
		}

		public Criteria andUsersIdIsNotNull() {
			addCriterion("USERS_ID is not null");
			return (Criteria) this;
		}

		public Criteria andUsersIdEqualTo(Integer value) {
			addCriterion("USERS_ID =", value, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdNotEqualTo(Integer value) {
			addCriterion("USERS_ID <>", value, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdGreaterThan(Integer value) {
			addCriterion("USERS_ID >", value, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("USERS_ID >=", value, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdLessThan(Integer value) {
			addCriterion("USERS_ID <", value, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
			addCriterion("USERS_ID <=", value, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdIn(List<Integer> values) {
			addCriterion("USERS_ID in", values, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdNotIn(List<Integer> values) {
			addCriterion("USERS_ID not in", values, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdBetween(Integer value1, Integer value2) {
			addCriterion("USERS_ID between", value1, value2, "usersId");
			return (Criteria) this;
		}

		public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
			addCriterion("USERS_ID not between", value1, value2, "usersId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdIsNull() {
			addCriterion("PM_CONVERSATION_ID is null");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdIsNotNull() {
			addCriterion("PM_CONVERSATION_ID is not null");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdEqualTo(Integer value) {
			addCriterion("PM_CONVERSATION_ID =", value, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdNotEqualTo(Integer value) {
			addCriterion("PM_CONVERSATION_ID <>", value, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdGreaterThan(Integer value) {
			addCriterion("PM_CONVERSATION_ID >", value, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("PM_CONVERSATION_ID >=", value, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdLessThan(Integer value) {
			addCriterion("PM_CONVERSATION_ID <", value, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdLessThanOrEqualTo(Integer value) {
			addCriterion("PM_CONVERSATION_ID <=", value, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdIn(List<Integer> values) {
			addCriterion("PM_CONVERSATION_ID in", values, "pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdNotIn(List<Integer> values) {
			addCriterion("PM_CONVERSATION_ID not in", values,
					"pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdBetween(Integer value1,
				Integer value2) {
			addCriterion("PM_CONVERSATION_ID between", value1, value2,
					"pmConversationId");
			return (Criteria) this;
		}

		public Criteria andPmConversationIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("PM_CONVERSATION_ID not between", value1, value2,
					"pmConversationId");
			return (Criteria) this;
		}

		public Criteria andReadFlagIsNull() {
			addCriterion("READ_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andReadFlagIsNotNull() {
			addCriterion("READ_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andReadFlagEqualTo(Boolean value) {
			addCriterion("READ_FLAG =", value, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagNotEqualTo(Boolean value) {
			addCriterion("READ_FLAG <>", value, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagGreaterThan(Boolean value) {
			addCriterion("READ_FLAG >", value, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("READ_FLAG >=", value, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagLessThan(Boolean value) {
			addCriterion("READ_FLAG <", value, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("READ_FLAG <=", value, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagIn(List<Boolean> values) {
			addCriterion("READ_FLAG in", values, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagNotIn(List<Boolean> values) {
			addCriterion("READ_FLAG not in", values, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagBetween(Boolean value1, Boolean value2) {
			addCriterion("READ_FLAG between", value1, value2, "readFlag");
			return (Criteria) this;
		}

		public Criteria andReadFlagNotBetween(Boolean value1, Boolean value2) {
			addCriterion("READ_FLAG not between", value1, value2, "readFlag");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table BR_USER_CONVERSATION
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BR_USER_CONVERSATION
     *
     * @mbggenerated do_not_delete_during_merge Sun Apr 01 23:08:55 EDT 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}