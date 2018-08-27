package com.zfgc.mappers;

import com.zfgc.dbobj.BrPmConversationUserInviteDbObj;
import com.zfgc.dbobj.BrPmConversationUserInviteDbObjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.zfgc.dbobj.BrPmConversationUserInviteDbObjKey;

public interface BrPmConversationUserInviteDbObjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int countByExample(BrPmConversationUserInviteDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int deleteByExample(BrPmConversationUserInviteDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int deleteByPrimaryKey(BrPmConversationUserInviteDbObjKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int insert(BrPmConversationUserInviteDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int insertSelective(BrPmConversationUserInviteDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	List<BrPmConversationUserInviteDbObj> selectByExample(
			BrPmConversationUserInviteDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	BrPmConversationUserInviteDbObj selectByPrimaryKey(
			BrPmConversationUserInviteDbObjKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int updateByExampleSelective(
			@Param("record") BrPmConversationUserInviteDbObj record,
			@Param("example") BrPmConversationUserInviteDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int updateByExample(
			@Param("record") BrPmConversationUserInviteDbObj record,
			@Param("example") BrPmConversationUserInviteDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int updateByPrimaryKeySelective(BrPmConversationUserInviteDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table BR_PM_CONVERSATION_USER_INVITE
	 * @mbggenerated  Fri Aug 17 00:26:30 EDT 2018
	 */
	int updateByPrimaryKey(BrPmConversationUserInviteDbObj record);
}