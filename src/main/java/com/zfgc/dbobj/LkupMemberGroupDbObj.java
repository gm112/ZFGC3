package com.zfgc.dbobj;

public class LkupMemberGroupDbObj {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.MEMBER_GROUP_ID
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private Integer memberGroupId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.GROUP_NAME
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private String groupName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.GROUP_DESC
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private String groupDesc;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.MIN_POSTS
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private Integer minPosts;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.STARS_SPRITE
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private String starsSprite;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.HIDDEN_FLAG
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private Boolean hiddenFlag;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column LKUP_MEMBER_GROUP.PARENT_GROUP
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	private Integer parentGroup;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column LKUP_MEMBER_GROUP.MEMBER_GROUP_ID
	 * @return  the value of LKUP_MEMBER_GROUP.MEMBER_GROUP_ID
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	public Integer getMemberGroupId() {
		return memberGroupId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column LKUP_MEMBER_GROUP.MEMBER_GROUP_ID
	 * @param memberGroupId  the value for LKUP_MEMBER_GROUP.MEMBER_GROUP_ID
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	public void setMemberGroupId(Integer memberGroupId) {
		this.memberGroupId = memberGroupId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column LKUP_MEMBER_GROUP.GROUP_NAME
	 * @return  the value of LKUP_MEMBER_GROUP.GROUP_NAME
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column LKUP_MEMBER_GROUP.GROUP_NAME
	 * @param groupName  the value for LKUP_MEMBER_GROUP.GROUP_NAME
	 * @mbggenerated  Sun Mar 17 20:30:42 EDT 2019
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}