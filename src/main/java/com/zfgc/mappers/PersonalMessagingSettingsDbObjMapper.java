package com.zfgc.mappers;

import com.zfgc.dbobj.PersonalMessagingSettingsDbObj;
import com.zfgc.dbobj.PersonalMessagingSettingsDbObjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalMessagingSettingsDbObjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int countByExample(PersonalMessagingSettingsDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int deleteByExample(PersonalMessagingSettingsDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int deleteByPrimaryKey(Integer personalMessagingSettingsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int insert(PersonalMessagingSettingsDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int insertSelective(PersonalMessagingSettingsDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	List<PersonalMessagingSettingsDbObj> selectByExample(
			PersonalMessagingSettingsDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	PersonalMessagingSettingsDbObj selectByPrimaryKey(
			Integer personalMessagingSettingsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int updateByExampleSelective(
			@Param("record") PersonalMessagingSettingsDbObj record,
			@Param("example") PersonalMessagingSettingsDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int updateByExample(@Param("record") PersonalMessagingSettingsDbObj record,
			@Param("example") PersonalMessagingSettingsDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int updateByPrimaryKeySelective(PersonalMessagingSettingsDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PERSONAL_MESSAGING_SETTINGS
	 * @mbggenerated  Sat Apr 27 18:59:31 EDT 2019
	 */
	int updateByPrimaryKey(PersonalMessagingSettingsDbObj record);
}