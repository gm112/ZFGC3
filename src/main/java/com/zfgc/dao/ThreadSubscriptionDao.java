package com.zfgc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zfgc.dbobj.ThreadSubscriptionViewDbObj;
import com.zfgc.dbobj.ThreadSubscriptionViewDbObjExample;
import com.zfgc.mappers.ThreadSubscriptionViewDbObjMapper;
import com.zfgc.model.BaseZfgcModel;
import com.zfgc.model.subscriptions.ThreadSubscription;

@Component
public class ThreadSubscriptionDao extends AbstractDao<ThreadSubscriptionViewDbObjExample, ThreadSubscriptionViewDbObj, ThreadSubscription>{

	@Autowired
	ThreadSubscriptionViewDbObjMapper threadSubscriptionViewDbObjMapper;
	
	public List<ThreadSubscriptionViewDbObj> getThreadSubscriptionsByUser(Integer userId, Integer lowerBound, Integer upperBound){
		List<ThreadSubscriptionViewDbObj> dbObj = null;

		dbObj = threadSubscriptionViewDbObjMapper.getThreadSubs(userId,lowerBound,upperBound);
		
		return dbObj;
	}
	
	public Integer totalSubscriptionThreads(Integer userId){
		ThreadSubscriptionViewDbObjExample ex = new ThreadSubscriptionViewDbObjExample();
		ex.createCriteria().andSubscriberIdEqualTo(userId);
		
		Integer result = threadSubscriptionViewDbObjMapper.countByExample(ex);
		
		return result;
	}
	
	public void deleteThreadSubscriptions(List<ThreadSubscription> subsToRemove){
		ThreadSubscriptionViewDbObjExample ex = new ThreadSubscriptionViewDbObjExample();
		
		List<Integer> userIds = new ArrayList<>();
		List<Integer> threadIds = new ArrayList<>();
		
		for(ThreadSubscription thread : subsToRemove){
			userIds.add(thread.getThreadStarterId());
			threadIds.add(thread.getThreadId());
		}
		
		ex.createCriteria().andThreadIdIn(threadIds);
		ex.createCriteria().andThreadStarterIdIn(userIds);
		
		threadSubscriptionViewDbObjMapper.deleteByExample(ex);
	}
	
	@Override
	public List<ThreadSubscriptionViewDbObj> get(
			ThreadSubscriptionViewDbObjExample ex) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hardDelete(ThreadSubscription obj) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrInsert(ThreadSubscription obj) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateByExample(ThreadSubscription obj,
			ThreadSubscriptionViewDbObjExample ex) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer deleteByExample(ThreadSubscription obj,
			ThreadSubscriptionViewDbObjExample ex) throws RuntimeException {
				return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long countByExample(ThreadSubscription obj,
			ThreadSubscriptionViewDbObjExample ex) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

}
