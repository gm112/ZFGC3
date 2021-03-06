package com.zfgc.model.users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zfgc.dataprovider.IpDataProvider;
import com.zfgc.dataprovider.UsersDataProvider;
import com.zfgc.model.BaseZfgcModel;
import com.zfgc.model.avatar.Avatar;
import com.zfgc.model.lkup.LkupMemberGroup;
import com.zfgc.model.users.profile.Buddy;
import com.zfgc.model.users.profile.NotificationSettings;
import com.zfgc.model.users.profile.PersonalInfo;
import com.zfgc.model.users.profile.PersonalMessagingSettings;
import com.zfgc.model.users.profile.UserProfileView;
import com.zfgc.util.time.ZfgcTimeUtils;

@Component
public class Users extends BaseZfgcModel implements UserDetails {
	private String password;
	private Integer ttlLogin;
	
	private Integer usersId;
	private String displayName;
	private String loginName;
	private Date dateRegistered;
	private Boolean activeFlag = null;
	private Date birthDate;
	private Integer gender;

	@JsonIgnore
	private Date lockedUntil;
	@JsonIgnore
	private Integer loginFailedAttempts;
	private Integer timeOffset;
	private String location;
	private Boolean agreeToTermsFlag = false;
	private Map<Integer,String> memberGroups = new HashMap<>();
	private SecondaryMemberGroups secondaryMemberGroups;
	private Integer primaryMemberGroupId;
	private String personalText;
	private String customTitle;
	private String websiteTitle;
	private String websiteUrl;
	private String timeZone;
	@JsonIgnore
	private Integer activeConnections;
	private Boolean isOnlineFlag;
	
	private IpAddress primaryIpAddress = new IpAddress();
	private List<IpAddress> secondaryIpAddresses = new ArrayList<>();
	
	private EmailAddress emailAddress;
	private Boolean hideEmailFlag;
	private String signature;
	private String signaturePreview;
	
	private UserContactInfo userContactInfo = new UserContactInfo();
	private UserSecurityInfo userSecurityInfo = new UserSecurityInfo();
	private NotificationSettings notificationSettings = new NotificationSettings();
	private PersonalMessagingSettings personalMessagingSettings = new PersonalMessagingSettings();
	private PersonalInfo personalInfo = new PersonalInfo();
	private List<Buddy> buddyList = new ArrayList<>();
	private Avatar avatar;
	private Date lastLogin;
	private Integer primaryIp;
	
	private LkupMemberGroup primaryMemberGroup;
	
	@JsonIgnore
	private List<Permissions> permissions;
	
	private String authToken;
	private Boolean fromDb = true;
	
	@JsonIgnore
	private String emailActivationCode;
	
	private Long unreadPmCount = 0L;
	
	private String gResponseToken;
	
	@JsonIgnore
	private String timeOffsetLkup;
	
	@JsonIgnore
	private UserHashInfo userHashInfo = new UserHashInfo();
	
	@JsonIgnore
	private UserProfileView savedProfile;
	
	//===================
	//Permissions
	//===================
	
	private boolean hasPerm(String permCode){
		if(permissions == null){
			return false;
		}
		
		for(Permissions perm : permissions){
			if(perm.getPermissionsCode().equals(permCode)){
				return true;
			}
		}
		
		return false;
	}
	
	public Boolean isMember(){
		return hasPerm("ZFGC_USER");
	}
	
	public Boolean isStaffMember(){
		return hasPerm("ZFGC_STAFF");
	}
	
	public Boolean isModerationStaff(){
		return hasPerm("ZFGC_MODERATION_STAFF");
	}
	
	public Boolean isAdministrationStaff(){
		return hasPerm("ZFGC_ADMINISTRATION_STAFF");
	}
	
	public Boolean isAccountSettingsEditorOrAdmin(){
		return hasPerm("ZFGC_ACCOUNT_SETTINGS_EDITOR") || hasPerm("ZFGC_ACCOUNT_SETTINGS_ADMIN");
	}
	
	public UserProfileView getSavedProfile() {
		return savedProfile;
	}
	public void setSavedProfile(UserProfileView savedProfile) {
		this.savedProfile = savedProfile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUsersId() {
		return usersId;
	}
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@JsonIgnore
	public UserHashInfo getUserHashInfo() {
		return userHashInfo;
	}
	public void setUserHashInfo(UserHashInfo userHashInfo) {
		this.userHashInfo = userHashInfo;
	}
	public Date getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean isActiveFlag) {
		this.activeFlag = isActiveFlag;
	}
	public IpAddress getPrimaryIpAddress() {
		return primaryIpAddress;
	}
	public void setPrimaryIpAddress(IpAddress primaryIpAddress) {
		this.primaryIpAddress = primaryIpAddress;
	}
	public List<IpAddress> getSecondaryIpAddresses() {
		return secondaryIpAddresses;
	}
	public void setSecondaryIpAddresses(List<IpAddress> secondaryIpAddresses) {
		this.secondaryIpAddresses = secondaryIpAddresses;
	}
	public EmailAddress getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(EmailAddress emailAddress){
		this.emailAddress = emailAddress;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	//Date functions
	public void setBirthDateAsString(String birthDateAsString){
		SimpleDateFormat sdf = ZfgcTimeUtils.getZfgcSimpleDateFormat();
		try {
			birthDate = sdf.parse(birthDateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
			birthDate = null;
		}
	}
	public String getBirthDateAsString(){
		if(birthDate == null){
			return "";
		}
		SimpleDateFormat sdf = ZfgcTimeUtils.getZfgcSimpleDateFormat();
		return sdf.format(birthDate);
	}
	
	public void setDateRegisteredAsString(String dateRegisteredAsString){
		SimpleDateFormat sdf = ZfgcTimeUtils.getZfgcSimpleDateFormat();
		try {
			dateRegistered = sdf.parse(dateRegisteredAsString);
		} catch (ParseException e) {
			e.printStackTrace();
			dateRegistered = null;
		}
	}
	public String getDateRegisteredAsString(){
		if(dateRegistered == null){
			return "";
		}
		
		SimpleDateFormat sdf = ZfgcTimeUtils.getZfgcSimpleDateFormat();
		return sdf.format(dateRegistered);
	}
	public Date getLockedUntil() {
		return lockedUntil;
	}
	public void setLockedUntil(Date lockedUntil) {
		this.lockedUntil = lockedUntil;
	}
	public String getLockedUntilAsString(){
		if(lockedUntil == null){
			return "";
		}
		
		SimpleDateFormat sdf = ZfgcTimeUtils.getZfgcSimpleDateFormat();
		return sdf.format(lockedUntil);
	}
	
	public void setLockedUntilAsString(String lockedUntilAsString){
		SimpleDateFormat sdf = ZfgcTimeUtils.getZfgcSimpleDateFormat();
		try {
			lockedUntil = sdf.parse(lockedUntilAsString);
		} catch (ParseException e) {
			e.printStackTrace();
			dateRegistered = null;
		}
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public Integer getTtlLogin() {
		return ttlLogin;
	}
	public void setTtlLogin(Integer ttlLogin) {
		this.ttlLogin = ttlLogin;
	}
	public Integer getTimeOffset() {
		return timeOffset;
	}
	public void setTimeOffset(Integer timeOffset) {
		this.timeOffset = timeOffset;
	}
	public Long getAge(){
		Long age = null;
		
		if(timeOffsetLkup == null){
			return age;
		}
		
		Date today = ZfgcTimeUtils.getToday(timeOffsetLkup);
		
		if(personalInfo.getBirthDate() != null){
			age = ZfgcTimeUtils.getYearsBetween(personalInfo.getBirthDate(), today);
		}

		return age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Boolean getAgreeToTermsFlag() {
		return agreeToTermsFlag;
	}
	public void setAgreeToTermsFlag(Boolean agreeToTermsFlag) {
		this.agreeToTermsFlag = agreeToTermsFlag;
	}
	public String getTimeOffsetLkup() {
		return timeOffsetLkup;
	}
	public void setTimeOffsetLkup(String timeOffsetLkup) {
		this.timeOffsetLkup = timeOffsetLkup;
	}
	
	public List<String> getMemberGroupNames(){
		return new ArrayList<String>(memberGroups.values());
	}
	
	public List<Integer> getMemberGroups() {
		return new ArrayList<Integer>(memberGroups.keySet());
	}
	@JsonIgnore
	public void setMemberGroups(Map<Integer,String> memberGroups) {
		this.memberGroups = memberGroups;
	}
	public Integer getPrimaryMemberGroupId() {
		return primaryMemberGroupId;
	}
	public void setPrimaryMemberGroupId(Integer primaryMemberGroupId) {
		this.primaryMemberGroupId = primaryMemberGroupId;
	}
	@Override
	public String getHMAC() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public Boolean getHideEmailFlag() {
		return hideEmailFlag;
	}
	public void setHideEmailFlag(Boolean hideEmailFlag) {
		this.hideEmailFlag = hideEmailFlag;
	}
	public Avatar getAvatar() {
		return avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getCustomTitle() {
		return customTitle;
	}
	public void setCustomTitle(String customTitle) {
		this.customTitle = customTitle;
	}
	public String getPersonalText() {
		return personalText;
	}
	public void setPersonalText(String personalText) {
		this.personalText = personalText;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getWebsiteTitle() {
		return websiteTitle;
	}
	public void setWebsiteTitle(String websiteTitle) {
		this.websiteTitle = websiteTitle;
	}
	public NotificationSettings getNotificationSettings() {
		return notificationSettings;
	}
	public void setNotificationSettings(NotificationSettings notificationSettings) {
		this.notificationSettings = notificationSettings;
	}
	public PersonalMessagingSettings getPersonalMessagingSettings() {
		return personalMessagingSettings;
	}
	public void setPersonalMessagingSettings(PersonalMessagingSettings personalMessagingSettings) {
		this.personalMessagingSettings = personalMessagingSettings;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getSignaturePreview() {
		return signaturePreview;
	}
	public void setSignaturePreview(String signaturePreview) {
		this.signaturePreview = signaturePreview;
	}
	@Override
	public BaseZfgcModel copy(BaseZfgcModel other) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		
		if(permissions != null){
			for(Permissions perm : permissions){
				authorities.add(new SimpleGrantedAuthority("ROLE_" + perm.getPermissionsCode()));
			}
		}
		return authorities;
		//return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	public Boolean getFromDb() {
		return fromDb;
	}
	public void setFromDb(Boolean fromDb) {
		this.fromDb = fromDb;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public Long getUnreadPmCount() {
		return unreadPmCount;
	}
	public void setUnreadPmCount(Long unreadPmCount) {
		this.unreadPmCount = unreadPmCount;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public UserSecurityInfo getUserSecurityInfo() {
		return userSecurityInfo;
	}
	public void setUserSecurityInfo(UserSecurityInfo userSecurityInfo) {
		this.userSecurityInfo = userSecurityInfo;
	}
	public UserContactInfo getUserContactInfo() {
		return userContactInfo;
	}
	public void setUserContactInfo(UserContactInfo userContactInfo) {
		this.userContactInfo = userContactInfo;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public List<Buddy> getBuddyList() {
		return buddyList;
	}
	public void setBuddyList(List<Buddy> buddyList) {
		this.buddyList = buddyList;
	}
	public boolean getIsManager(){
		return (primaryMemberGroupId != null && primaryMemberGroupId == 1 || memberGroups.containsKey(1));
	}
	@JsonIgnore
	public boolean getHasRoles(String ... roles){
		//todo: add role checks
		return true;
	}
	public Boolean getIsOnlineFlag() {
		return isOnlineFlag;
	}
	public void setIsOnlineFlag(Boolean isOnlineFlag) {
		this.isOnlineFlag = isOnlineFlag;
	}
	public Integer getActiveConnections() {
		return activeConnections;
	}
	public void setActiveConnections(Integer activeConnections) {
		this.activeConnections = activeConnections;
	}
	public Integer getLoginFailedAttempts() {
		return loginFailedAttempts;
	}
	public void setLoginFailedAttempts(Integer loginFailedAttempts) {
		this.loginFailedAttempts = loginFailedAttempts;
	}
	public String getgResponseToken() {
		return gResponseToken;
	}
	public void setgResponseToken(String gResponseToken) {
		this.gResponseToken = gResponseToken;
	}
	public String getEmailActivationCode() {
		return emailActivationCode;
	}
	public void setEmailActivationCode(String emailActivationCode) {
		this.emailActivationCode = emailActivationCode;
	}
	public Integer getPrimaryIp() {
		return primaryIp;
	}
	public void setPrimaryIp(Integer primaryIp) {
		this.primaryIp = primaryIp;
	}
	@JsonIgnore
	public String getCurrentIpAddress() {
		return super.getUserIp();
	}
	public SecondaryMemberGroups getSecondaryMemberGroups() {
		return secondaryMemberGroups;
	}
	public void setSecondaryMemberGroups(SecondaryMemberGroups secondaryMemberGroups) {
		this.secondaryMemberGroups = secondaryMemberGroups;
	}
	public List<Permissions> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permissions> permissions) {
		this.permissions = permissions;
	}

	public LkupMemberGroup getPrimaryMemberGroup() {
		return primaryMemberGroup;
	}

	public void setPrimaryMemberGroup(LkupMemberGroup primaryMemberGroup) {
		this.primaryMemberGroup = primaryMemberGroup;
	}
}
