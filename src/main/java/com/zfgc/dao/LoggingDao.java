package com.zfgc.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zfgc.dbobj.ActivityLogDbObj;
import com.zfgc.dbobj.ActivityLogDbObjExample;
import com.zfgc.mappers.ActivityLogDbObjMapper;
import com.zfgc.model.BaseZfgcModel;
import com.zfgc.model.logging.ActivityLog;
import com.zfgc.util.time.ZfgcTimeUtils;

@Component
public class LoggingDao extends AbstractDao<ActivityLogDbObjExample, ActivityLogDbObj, ActivityLog> {
	@Autowired
	ActivityLogDbObjMapper activityLogDbObjMapper;
	
	private Logger LOGGER = LogManager.getLogger(LoggingDao.class);
	
	public void logAction(Integer logType, String description, Integer usersId, String ipAddress) throws Exception{
		ActivityLogDbObj activityLogDbObj = new ActivityLogDbObj();
		
		activityLogDbObj.setLogTypeId(logType);
		activityLogDbObj.setDescription(description);
		activityLogDbObj.setUsersId(usersId);
		activityLogDbObj.setIpAddress(ipAddress);
		activityLogDbObj.setLogDate(ZfgcTimeUtils.getToday());

		try{
			activityLogDbObjMapper.insertSelective(activityLogDbObj);
		}
		catch(Exception ex){
			logDbInsertError(LOGGER, "ACTIVITY_LOG");
			throw new Exception(ex.getMessage());
		}
	}
	
	public List<ActivityLogDbObj> getLogs(ActivityLogDbObjExample example){
		return activityLogDbObjMapper.selectByExample(example);
	}

	@Override
	public List<ActivityLogDbObj> get(ActivityLogDbObjExample ex) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hardDelete(ActivityLog obj) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrInsert(ActivityLog obj) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateByExample(ActivityLog obj, ActivityLogDbObjExample ex) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer deleteByExample(ActivityLog obj, ActivityLogDbObjExample ex) throws RuntimeException {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long countByExample(ActivityLog obj, ActivityLogDbObjExample ex)
			throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
