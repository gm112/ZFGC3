package com.zfgc.dbobj;

public class BrUserConversationDbObjKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column BR_USER_CONVERSATION.USERS_ID
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	private Integer usersId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column BR_USER_CONVERSATION.PM_CONVERSATION_ID
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	private Integer pmConversationId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column BR_USER_CONVERSATION.USERS_ID
	 * @return  the value of BR_USER_CONVERSATION.USERS_ID
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public Integer getUsersId() {
		return usersId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column BR_USER_CONVERSATION.USERS_ID
	 * @param usersId  the value for BR_USER_CONVERSATION.USERS_ID
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column BR_USER_CONVERSATION.PM_CONVERSATION_ID
	 * @return  the value of BR_USER_CONVERSATION.PM_CONVERSATION_ID
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public Integer getPmConversationId() {
		return pmConversationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column BR_USER_CONVERSATION.PM_CONVERSATION_ID
	 * @param pmConversationId  the value for BR_USER_CONVERSATION.PM_CONVERSATION_ID
	 * @mbggenerated  Sun Aug 19 21:53:20 EDT 2018
	 */
	public void setPmConversationId(Integer pmConversationId) {
		this.pmConversationId = pmConversationId;
	}
}