package com.zfgc.mappers;

import com.zfgc.dbobj.UserProfileViewDbObj;
import com.zfgc.dbobj.UserProfileViewDbObjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProfileViewDbObjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	long countByExample(UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	int deleteByExample(UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	int insert(UserProfileViewDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	int insertSelective(UserProfileViewDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	List<UserProfileViewDbObj> selectByExample(UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	int updateByExampleSelective(@Param("record") UserProfileViewDbObj record,
			@Param("example") UserProfileViewDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_PROFILE_VIEW
	 * @mbg.generated  Sun Mar 31 13:23:26 EDT 2019
	 */
	int updateByExample(@Param("record") UserProfileViewDbObj record,
			@Param("example") UserProfileViewDbObjExample example);
}