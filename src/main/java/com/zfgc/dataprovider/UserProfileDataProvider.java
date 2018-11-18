package com.zfgc.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zfgc.dao.EmailAddressDao;
import com.zfgc.dao.UserContactSettingsDao;
import com.zfgc.dao.UserProfileDao;
import com.zfgc.dao.UserSecuritySettingsDao;
import com.zfgc.dbobj.UserProfileViewDbObj;
import com.zfgc.exception.ZfgcNotFoundException;
import com.zfgc.model.users.profile.Avatar;
import com.zfgc.model.users.EmailAddress;
import com.zfgc.model.users.UserContactInfo;
import com.zfgc.model.users.UserSecurityInfo;
import com.zfgc.model.users.Users;
import com.zfgc.model.users.profile.PersonalInfo;
import com.zfgc.model.users.profile.ProfileSummary;
import com.zfgc.model.users.profile.UserProfileView;
import com.zfgc.services.authentication.AuthenticationService;
import com.zfgc.services.notifications.NotificationsService;

@Component
public class UserProfileDataProvider extends AbstractDataProvider {
	@Autowired
	UserProfileDao userProfileDao;
	
	@Autowired
	AuthenticationService authenticationService;
	
	@Autowired
	NotificationsService notificationsService;
	
	@Autowired
	UserContactSettingsDao userContactSettingsDao;
	
	@Autowired
	UserSecuritySettingsDao userSecuritySettingsDao;
	
	@Autowired
	EmailAddressDao emailAddressDao;
	
	public UserProfileView getUserProfile(Integer userId) throws Exception{
		UserProfileViewDbObj userProfileViewDbObj = null;
		try{
			userProfileViewDbObj = userProfileDao.getUserProfile(userId);
		}
		catch(ZfgcNotFoundException ex){
			throw new ZfgcNotFoundException(ex.getResourceName());
		}
		
		UserProfileView result = mapper.map(userProfileViewDbObj, UserProfileView.class);
		result.setProfileSummary(mapper.map(userProfileViewDbObj, ProfileSummary.class));
		result.setUserContactInfo(mapper.map(userProfileViewDbObj,UserContactInfo.class));
		result.getUserContactInfo().setEmail(mapper.map(userProfileViewDbObj, EmailAddress.class));
		result.setUserSecurityInfo(mapper.map(userProfileViewDbObj, UserSecurityInfo.class));
		result.setAvatar(mapper.map(userProfileViewDbObj, Avatar.class));
		result.setPersonalInfo(mapper.map(userProfileViewDbObj, PersonalInfo.class));
		//transformProfileAvatarData(user, userProfileViewDbObj);

		return result;
	}
	
	public void saveNotificationSettings(Users notificationSettings) throws Exception{
		notificationsService.saveNotificationSettings(notificationSettings.getNotificationSettings());
	}
	
	public void saveAccountSettings(Users accountSettings) throws Exception {
		//authenticationService.logEmailAddress(accountSettings.getEmailAddress());
		//create or update email address table
		emailAddressDao.updateOrInsert(accountSettings.getUserContactInfo().getEmail());
		
		userContactSettingsDao.updateOrInsert(accountSettings.getUserContactInfo());
		userSecuritySettingsDao.updateOrInsert(accountSettings.getUserSecurityInfo());
	}
	
	private void updateEmailAddress(Integer usersId, String email) throws Exception {
		
	}
	
	public void savePmSettings(Users pmSettings) throws Exception{
		userProfileDao.savePmSettings(pmSettings);
	}
	
	public void saveForumProfile(Users forumProfile) throws Exception{
		userProfileDao.saveAccountSettings(forumProfile);
	}
	
	private void transformProfileAvatarData(Users user, UserProfileViewDbObj profile){
		//todo: add constants for urls
		//if they have a gallery avatar, use that as the filename
		/*Avatar avatar = new Avatar();
		avatar.setAvatarTypeId(profile.getAvatarTypeId());
		avatar.setAvatarGalleryId(profile.getAvatarGalleryId());
		avatar.setAvatarId(profile.getAvatarId());

		//if they have a custom avatar uploaded elsewhere, use that as the filename
		if(profile.getAvatarTypeId() == 3 && profile.getAvatarUrl() != null){
			avatar.setAvatarFileName(profile.getAvatarUrl());
		}
		
		user.setAvatar(avatar);*/
	}
}
