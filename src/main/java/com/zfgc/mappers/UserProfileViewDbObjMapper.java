package com.zfgc.mappers;

import com.zfgc.dbobj.UserProfileViewDbObj;
import com.zfgc.dbobj.UserProfileViewDbObjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProfileViewDbObjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	int countByExample(UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	int deleteByExample(UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	int insert(UserProfileViewDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	int insertSelective(UserProfileViewDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	List<UserProfileViewDbObj> selectByExample(
			UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	int updateByExampleSelective(@Param("record") UserProfileViewDbObj record,
			@Param("example") UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbggenerated  Sat Feb 25 18:45:20 EST 2017
	 */
	int updateByExample(@Param("record") UserProfileViewDbObj record,
			@Param("example") UserProfileViewDbObjExample example);
}