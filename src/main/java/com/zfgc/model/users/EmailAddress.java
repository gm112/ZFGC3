package com.zfgc.model.users;

import com.zfgc.model.BaseZfgcModel;

public class EmailAddress extends BaseZfgcModel{
	private String emailAddress;
	private Boolean isSpammerFlag = true;
	private Integer emailAddressId;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Boolean getIsSpammerFlag() {
		return isSpammerFlag;
	}
	public void setIsSpammerFlag(Boolean isSpammerFlag) {
		this.isSpammerFlag = isSpammerFlag;
	}
	@Override
	public String getHMAC() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BaseZfgcModel copy(BaseZfgcModel other) {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getEmailAddressId() {
		return emailAddressId;
	}
	public void setEmailAddressId(Integer emailAddressId) {
		this.emailAddressId = emailAddressId;
	}
	
	
}