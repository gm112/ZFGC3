package com.zfgc.dbobj;

import java.util.Date;

public class IpAddressDbObj {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.IP_ADDRESS_ID
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private Integer ipAddressId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.IP_ADDRESS
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private String ipAddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.VERSION
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private Byte version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.IS_SPAMMER_FLAG
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private Boolean isSpammerFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.IS_LOCKED_FLAG
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private Boolean isLockedFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.LOCKED_UNTIL
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private Date lockedUntil;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column IP_ADDRESS.LOGIN_ATTEMPTS
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	private Integer loginAttempts;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.IP_ADDRESS_ID
	 * @return  the value of IP_ADDRESS.IP_ADDRESS_ID
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public Integer getIpAddressId() {
		return ipAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.IP_ADDRESS_ID
	 * @param ipAddressId  the value for IP_ADDRESS.IP_ADDRESS_ID
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setIpAddressId(Integer ipAddressId) {
		this.ipAddressId = ipAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.IP_ADDRESS
	 * @return  the value of IP_ADDRESS.IP_ADDRESS
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.IP_ADDRESS
	 * @param ipAddress  the value for IP_ADDRESS.IP_ADDRESS
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.VERSION
	 * @return  the value of IP_ADDRESS.VERSION
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public Byte getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.VERSION
	 * @param version  the value for IP_ADDRESS.VERSION
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setVersion(Byte version) {
		this.version = version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.IS_SPAMMER_FLAG
	 * @return  the value of IP_ADDRESS.IS_SPAMMER_FLAG
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public Boolean getIsSpammerFlag() {
		return isSpammerFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.IS_SPAMMER_FLAG
	 * @param isSpammerFlag  the value for IP_ADDRESS.IS_SPAMMER_FLAG
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setIsSpammerFlag(Boolean isSpammerFlag) {
		this.isSpammerFlag = isSpammerFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.IS_LOCKED_FLAG
	 * @return  the value of IP_ADDRESS.IS_LOCKED_FLAG
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public Boolean getIsLockedFlag() {
		return isLockedFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.IS_LOCKED_FLAG
	 * @param isLockedFlag  the value for IP_ADDRESS.IS_LOCKED_FLAG
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setIsLockedFlag(Boolean isLockedFlag) {
		this.isLockedFlag = isLockedFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.LOCKED_UNTIL
	 * @return  the value of IP_ADDRESS.LOCKED_UNTIL
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public Date getLockedUntil() {
		return lockedUntil;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.LOCKED_UNTIL
	 * @param lockedUntil  the value for IP_ADDRESS.LOCKED_UNTIL
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setLockedUntil(Date lockedUntil) {
		this.lockedUntil = lockedUntil;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column IP_ADDRESS.LOGIN_ATTEMPTS
	 * @return  the value of IP_ADDRESS.LOGIN_ATTEMPTS
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public Integer getLoginAttempts() {
		return loginAttempts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column IP_ADDRESS.LOGIN_ATTEMPTS
	 * @param loginAttempts  the value for IP_ADDRESS.LOGIN_ATTEMPTS
	 * @mbggenerated  Tue Apr 30 12:15:34 EDT 2019
	 */
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
}