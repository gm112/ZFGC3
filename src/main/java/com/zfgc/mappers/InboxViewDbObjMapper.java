package com.zfgc.mappers;

import com.zfgc.dbobj.InboxViewDbObj;
import com.zfgc.dbobj.InboxViewDbObjExample;
import com.zfgc.dbobj.InboxViewDbObjWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InboxViewDbObjMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int countByExample(InboxViewDbObjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int deleteByExample(InboxViewDbObjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int insert(InboxViewDbObjWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int insertSelective(InboxViewDbObjWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    List<InboxViewDbObjWithBLOBs> selectByExampleWithBLOBs(InboxViewDbObjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    List<InboxViewDbObj> selectByExample(InboxViewDbObjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int updateByExampleSelective(@Param("record") InboxViewDbObjWithBLOBs record, @Param("example") InboxViewDbObjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int updateByExampleWithBLOBs(@Param("record") InboxViewDbObjWithBLOBs record, @Param("example") InboxViewDbObjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INBOX_VIEW
     *
     * @mbggenerated Mon Sep 04 20:44:22 EDT 2017
     */
    int updateByExample(@Param("record") InboxViewDbObj record, @Param("example") InboxViewDbObjExample example);
}