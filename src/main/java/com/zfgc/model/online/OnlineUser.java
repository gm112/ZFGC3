package com.zfgc.model.online;

import com.zfgc.model.BaseZfgcModel;

public class OnlineUser extends BaseZfgcModel {
	private Integer usersId;
	private String displayName;
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
	@Override
	public String getHMAC() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
