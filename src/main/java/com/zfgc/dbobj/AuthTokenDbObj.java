package com.zfgc.dbobj;

import java.util.Date;

public class AuthTokenDbObj {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_TOKEN.AUTH_TOKEN_ID
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    private Integer authTokenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_TOKEN.USERS_ID
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    private Integer usersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_TOKEN.TOKEN
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_TOKEN.TTL
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    private Date ttl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_TOKEN.CREATE_TIMESTAMP
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    private Date createTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_TOKEN.AUTH_TOKEN_ID
     *
     * @return the value of AUTH_TOKEN.AUTH_TOKEN_ID
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public Integer getAuthTokenId() {
        return authTokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_TOKEN.AUTH_TOKEN_ID
     *
     * @param authTokenId the value for AUTH_TOKEN.AUTH_TOKEN_ID
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public void setAuthTokenId(Integer authTokenId) {
        this.authTokenId = authTokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_TOKEN.USERS_ID
     *
     * @return the value of AUTH_TOKEN.USERS_ID
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public Integer getUsersId() {
        return usersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_TOKEN.USERS_ID
     *
     * @param usersId the value for AUTH_TOKEN.USERS_ID
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_TOKEN.TOKEN
     *
     * @return the value of AUTH_TOKEN.TOKEN
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_TOKEN.TOKEN
     *
     * @param token the value for AUTH_TOKEN.TOKEN
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_TOKEN.TTL
     *
     * @return the value of AUTH_TOKEN.TTL
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public Date getTtl() {
        return ttl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_TOKEN.TTL
     *
     * @param ttl the value for AUTH_TOKEN.TTL
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public void setTtl(Date ttl) {
        this.ttl = ttl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_TOKEN.CREATE_TIMESTAMP
     *
     * @return the value of AUTH_TOKEN.CREATE_TIMESTAMP
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_TOKEN.CREATE_TIMESTAMP
     *
     * @param createTimestamp the value for AUTH_TOKEN.CREATE_TIMESTAMP
     *
     * @mbggenerated Sat Dec 03 17:22:07 EST 2016
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}