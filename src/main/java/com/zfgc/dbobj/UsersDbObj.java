package com.zfgc.dbobj;

public class UsersDbObj {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USERS_ID
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    private Integer usersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.LOGIN_NAME
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.DISPLAY_NAME
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    private String displayName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.PASSWORD
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.PASS_SALT
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    private String passSalt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USERS_ID
     *
     * @return the value of users.USERS_ID
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public Integer getUsersId() {
        return usersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USERS_ID
     *
     * @param usersId the value for users.USERS_ID
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.LOGIN_NAME
     *
     * @return the value of users.LOGIN_NAME
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.LOGIN_NAME
     *
     * @param loginName the value for users.LOGIN_NAME
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.DISPLAY_NAME
     *
     * @return the value of users.DISPLAY_NAME
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.DISPLAY_NAME
     *
     * @param displayName the value for users.DISPLAY_NAME
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.PASSWORD
     *
     * @return the value of users.PASSWORD
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.PASSWORD
     *
     * @param password the value for users.PASSWORD
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.PASS_SALT
     *
     * @return the value of users.PASS_SALT
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public String getPassSalt() {
        return passSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.PASS_SALT
     *
     * @param passSalt the value for users.PASS_SALT
     *
     * @mbg.generated Sun Oct 16 10:38:04 EDT 2016
     */
    public void setPassSalt(String passSalt) {
        this.passSalt = passSalt;
    }
}