package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class BbCodeConfigDbObjExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public BbCodeConfigDbObjExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
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

		public Criteria andBbCodeConfigIdIsNull() {
			addCriterion("BB_CODE_CONFIG_ID is null");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdIsNotNull() {
			addCriterion("BB_CODE_CONFIG_ID is not null");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdEqualTo(Integer value) {
			addCriterion("BB_CODE_CONFIG_ID =", value, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdNotEqualTo(Integer value) {
			addCriterion("BB_CODE_CONFIG_ID <>", value, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdGreaterThan(Integer value) {
			addCriterion("BB_CODE_CONFIG_ID >", value, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("BB_CODE_CONFIG_ID >=", value, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdLessThan(Integer value) {
			addCriterion("BB_CODE_CONFIG_ID <", value, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdLessThanOrEqualTo(Integer value) {
			addCriterion("BB_CODE_CONFIG_ID <=", value, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdIn(List<Integer> values) {
			addCriterion("BB_CODE_CONFIG_ID in", values, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdNotIn(List<Integer> values) {
			addCriterion("BB_CODE_CONFIG_ID not in", values, "bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdBetween(Integer value1, Integer value2) {
			addCriterion("BB_CODE_CONFIG_ID between", value1, value2,
					"bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andBbCodeConfigIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("BB_CODE_CONFIG_ID not between", value1, value2,
					"bbCodeConfigId");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("CODE is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("CODE is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("CODE =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("CODE <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("CODE >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("CODE >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("CODE <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("CODE <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("CODE like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("CODE not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("CODE in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("CODE not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("CODE between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("CODE not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andEndTagIsNull() {
			addCriterion("END_TAG is null");
			return (Criteria) this;
		}

		public Criteria andEndTagIsNotNull() {
			addCriterion("END_TAG is not null");
			return (Criteria) this;
		}

		public Criteria andEndTagEqualTo(String value) {
			addCriterion("END_TAG =", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagNotEqualTo(String value) {
			addCriterion("END_TAG <>", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagGreaterThan(String value) {
			addCriterion("END_TAG >", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagGreaterThanOrEqualTo(String value) {
			addCriterion("END_TAG >=", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagLessThan(String value) {
			addCriterion("END_TAG <", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagLessThanOrEqualTo(String value) {
			addCriterion("END_TAG <=", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagLike(String value) {
			addCriterion("END_TAG like", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagNotLike(String value) {
			addCriterion("END_TAG not like", value, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagIn(List<String> values) {
			addCriterion("END_TAG in", values, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagNotIn(List<String> values) {
			addCriterion("END_TAG not in", values, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagBetween(String value1, String value2) {
			addCriterion("END_TAG between", value1, value2, "endTag");
			return (Criteria) this;
		}

		public Criteria andEndTagNotBetween(String value1, String value2) {
			addCriterion("END_TAG not between", value1, value2, "endTag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagIsNull() {
			addCriterion("PROCESS_CONTENT_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagIsNotNull() {
			addCriterion("PROCESS_CONTENT_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagEqualTo(Boolean value) {
			addCriterion("PROCESS_CONTENT_FLAG =", value, "processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagNotEqualTo(Boolean value) {
			addCriterion("PROCESS_CONTENT_FLAG <>", value, "processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagGreaterThan(Boolean value) {
			addCriterion("PROCESS_CONTENT_FLAG >", value, "processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("PROCESS_CONTENT_FLAG >=", value, "processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagLessThan(Boolean value) {
			addCriterion("PROCESS_CONTENT_FLAG <", value, "processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("PROCESS_CONTENT_FLAG <=", value, "processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagIn(List<Boolean> values) {
			addCriterion("PROCESS_CONTENT_FLAG in", values,
					"processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagNotIn(List<Boolean> values) {
			addCriterion("PROCESS_CONTENT_FLAG not in", values,
					"processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagBetween(Boolean value1,
				Boolean value2) {
			addCriterion("PROCESS_CONTENT_FLAG between", value1, value2,
					"processContentFlag");
			return (Criteria) this;
		}

		public Criteria andProcessContentFlagNotBetween(Boolean value1,
				Boolean value2) {
			addCriterion("PROCESS_CONTENT_FLAG not between", value1, value2,
					"processContentFlag");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table BB_CODE_CONFIG
	 * @mbggenerated  Thu Jun 22 22:39:16 EDT 2017
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
     * This class corresponds to the database table BB_CODE_CONFIG
     *
     * @mbggenerated do_not_delete_during_merge Sat Jun 17 00:27:00 EDT 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}