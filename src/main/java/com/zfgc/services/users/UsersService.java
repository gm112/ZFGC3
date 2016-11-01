package com.zfgc.services.users;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zfgc.dataprovider.UsersDataProvider;
import com.zfgc.model.users.Users;
import com.zfgc.requiredfields.users.UsersRequiredFieldsChecker;
import com.zfgc.services.authentication.AuthenticationService;

@Service
public class UsersService {
	@Autowired 
	AuthenticationService authenticationService;
	
	@Autowired
	UsersDataProvider usersDataProvider;
	
	@Autowired 
	UsersRequiredFieldsChecker requiredFieldsChecker;
	
	public Users createNewUser(Users user, HttpServletRequest requestHeader){
		requiredFieldsChecker.requiredFieldsCheck(user);
		
		if(!user.getErrors().hasErrors()){
			user.getUserHashInfo().setPassSalt(authenticationService.generateSalt());
			user.getUserHashInfo().setPassword(authenticationService.createPasswordHash(user.getPassword(), user.getUserHashInfo().getPassSalt()));
			
			user.setDateRegistered(new Date());
			user.setIsActiveFlag(false);
			
			user.getPrimaryIpAddress().setIpAddress(requestHeader.getRemoteAddr());
			user.getPrimaryIpAddress().setVersion(requestHeader.getRemoteAddr().length() > 15 ? 6 : 4);
			
			setUserIsSpammer(user);
			try {
				user = usersDataProvider.createUser(user);
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}
		}
		
		return user;
	}
	
	public Boolean checkUserPassword(String password, String userName){
		try{
			return authenticationService.checkUserPassword(userName, password);
		}
		catch(Exception ex){
			return false;
		}
	}
	
	public void setUserIsSpammer(Users user){
		//todo: figure out how to actually query a spammer db
		user.getPrimaryIpAddress().setIsSpammer(false);
	}
}