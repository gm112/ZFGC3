package com.zfgc.mappers;

import com.zfgc.dbobj.PmKeyDbObj;
import com.zfgc.dbobj.PmKeyDbObjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmKeyDbObjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int countByExample(PmKeyDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int deleteByExample(PmKeyDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int deleteByPrimaryKey(Integer pmKeyId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int insert(PmKeyDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int insertSelective(PmKeyDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	List<PmKeyDbObj> selectByExample(PmKeyDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	PmKeyDbObj selectByPrimaryKey(Integer pmKeyId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int updateByExampleSelective(@Param("record") PmKeyDbObj record,
			@Param("example") PmKeyDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int updateByExample(@Param("record") PmKeyDbObj record,
			@Param("example") PmKeyDbObjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int updateByPrimaryKeySelective(PmKeyDbObj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PM_KEY
	 * @mbggenerated  Sun Sep 03 11:08:46 EDT 2017
	 */
	int updateByPrimaryKey(PmKeyDbObj record);
}