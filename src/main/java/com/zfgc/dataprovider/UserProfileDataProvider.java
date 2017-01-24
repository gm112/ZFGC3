package com.zfgc.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zfgc.dao.UserProfileDao;
import com.zfgc.dbobj.UserProfileViewDbObj;
import com.zfgc.exception.ZfgcNotFoundException;
import com.zfgc.model.users.profile.ProfileSummary;
import com.zfgc.model.users.profile.UserProfileView;

@Component
public class UserProfileDataProvider extends AbstractDataProvider {
	@Autowired
	UserProfileDao userProfileDao;
	
	public UserProfileView getUserProfile(Integer userId) throws Exception{
		UserProfileView userProfileView = new UserProfileView();
		
		try{
			UserProfileViewDbObj userProfileViewDbObj = userProfileDao.getUserProfile(userId);
		
			userProfileView.setProfileSummary(mapper.map(userProfileViewDbObj, ProfileSummary.class));
		}
		catch(ZfgcNotFoundException ex){
			throw new ZfgcNotFoundException(ex.getResourceName());
		}
		
		return userProfileView;
	}
}