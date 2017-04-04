package com.zfgc.dbobj;

import java.util.ArrayList;
import java.util.List;

public class AvatarDbObjExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public AvatarDbObjExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
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

		public Criteria andAvatarIdIsNull() {
			addCriterion("AVATAR_ID is null");
			return (Criteria) this;
		}

		public Criteria andAvatarIdIsNotNull() {
			addCriterion("AVATAR_ID is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarIdEqualTo(Integer value) {
			addCriterion("AVATAR_ID =", value, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdNotEqualTo(Integer value) {
			addCriterion("AVATAR_ID <>", value, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdGreaterThan(Integer value) {
			addCriterion("AVATAR_ID >", value, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("AVATAR_ID >=", value, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdLessThan(Integer value) {
			addCriterion("AVATAR_ID <", value, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdLessThanOrEqualTo(Integer value) {
			addCriterion("AVATAR_ID <=", value, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdIn(List<Integer> values) {
			addCriterion("AVATAR_ID in", values, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdNotIn(List<Integer> values) {
			addCriterion("AVATAR_ID not in", values, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdBetween(Integer value1, Integer value2) {
			addCriterion("AVATAR_ID between", value1, value2, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarIdNotBetween(Integer value1, Integer value2) {
			addCriterion("AVATAR_ID not between", value1, value2, "avatarId");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameIsNull() {
			addCriterion("AVATAR_FILENAME is null");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameIsNotNull() {
			addCriterion("AVATAR_FILENAME is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameEqualTo(String value) {
			addCriterion("AVATAR_FILENAME =", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameNotEqualTo(String value) {
			addCriterion("AVATAR_FILENAME <>", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameGreaterThan(String value) {
			addCriterion("AVATAR_FILENAME >", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameGreaterThanOrEqualTo(String value) {
			addCriterion("AVATAR_FILENAME >=", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameLessThan(String value) {
			addCriterion("AVATAR_FILENAME <", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameLessThanOrEqualTo(String value) {
			addCriterion("AVATAR_FILENAME <=", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameLike(String value) {
			addCriterion("AVATAR_FILENAME like", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameNotLike(String value) {
			addCriterion("AVATAR_FILENAME not like", value, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameIn(List<String> values) {
			addCriterion("AVATAR_FILENAME in", values, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameNotIn(List<String> values) {
			addCriterion("AVATAR_FILENAME not in", values, "avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameBetween(String value1, String value2) {
			addCriterion("AVATAR_FILENAME between", value1, value2,
					"avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarFilenameNotBetween(String value1, String value2) {
			addCriterion("AVATAR_FILENAME not between", value1, value2,
					"avatarFilename");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIsNull() {
			addCriterion("AVATAR_URL is null");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIsNotNull() {
			addCriterion("AVATAR_URL is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlEqualTo(String value) {
			addCriterion("AVATAR_URL =", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotEqualTo(String value) {
			addCriterion("AVATAR_URL <>", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlGreaterThan(String value) {
			addCriterion("AVATAR_URL >", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
			addCriterion("AVATAR_URL >=", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLessThan(String value) {
			addCriterion("AVATAR_URL <", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
			addCriterion("AVATAR_URL <=", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLike(String value) {
			addCriterion("AVATAR_URL like", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotLike(String value) {
			addCriterion("AVATAR_URL not like", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIn(List<String> values) {
			addCriterion("AVATAR_URL in", values, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotIn(List<String> values) {
			addCriterion("AVATAR_URL not in", values, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlBetween(String value1, String value2) {
			addCriterion("AVATAR_URL between", value1, value2, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotBetween(String value1, String value2) {
			addCriterion("AVATAR_URL not between", value1, value2, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdIsNull() {
			addCriterion("AVATAR_GALLERY_ID is null");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdIsNotNull() {
			addCriterion("AVATAR_GALLERY_ID is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdEqualTo(Integer value) {
			addCriterion("AVATAR_GALLERY_ID =", value, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdNotEqualTo(Integer value) {
			addCriterion("AVATAR_GALLERY_ID <>", value, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdGreaterThan(Integer value) {
			addCriterion("AVATAR_GALLERY_ID >", value, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("AVATAR_GALLERY_ID >=", value, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdLessThan(Integer value) {
			addCriterion("AVATAR_GALLERY_ID <", value, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdLessThanOrEqualTo(Integer value) {
			addCriterion("AVATAR_GALLERY_ID <=", value, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdIn(List<Integer> values) {
			addCriterion("AVATAR_GALLERY_ID in", values, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdNotIn(List<Integer> values) {
			addCriterion("AVATAR_GALLERY_ID not in", values, "avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdBetween(Integer value1, Integer value2) {
			addCriterion("AVATAR_GALLERY_ID between", value1, value2,
					"avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarGalleryIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("AVATAR_GALLERY_ID not between", value1, value2,
					"avatarGalleryId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdIsNull() {
			addCriterion("AVATAR_TYPE_ID is null");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdIsNotNull() {
			addCriterion("AVATAR_TYPE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdEqualTo(Integer value) {
			addCriterion("AVATAR_TYPE_ID =", value, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdNotEqualTo(Integer value) {
			addCriterion("AVATAR_TYPE_ID <>", value, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdGreaterThan(Integer value) {
			addCriterion("AVATAR_TYPE_ID >", value, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("AVATAR_TYPE_ID >=", value, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdLessThan(Integer value) {
			addCriterion("AVATAR_TYPE_ID <", value, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdLessThanOrEqualTo(Integer value) {
			addCriterion("AVATAR_TYPE_ID <=", value, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdIn(List<Integer> values) {
			addCriterion("AVATAR_TYPE_ID in", values, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdNotIn(List<Integer> values) {
			addCriterion("AVATAR_TYPE_ID not in", values, "avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdBetween(Integer value1, Integer value2) {
			addCriterion("AVATAR_TYPE_ID between", value1, value2,
					"avatarTypeId");
			return (Criteria) this;
		}

		public Criteria andAvatarTypeIdNotBetween(Integer value1, Integer value2) {
			addCriterion("AVATAR_TYPE_ID not between", value1, value2,
					"avatarTypeId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table AVATAR
	 * @mbggenerated  Mon Feb 06 20:22:57 EST 2017
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
     * This class corresponds to the database table AVATAR
     *
     * @mbggenerated do_not_delete_during_merge Sun Feb 05 21:19:29 EST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}