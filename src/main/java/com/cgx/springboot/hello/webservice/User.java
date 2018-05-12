package com.cgx.springboot.hello.webservice;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    private static final long serialVersionUID = -5939599230753662529L;
    private Long     userId;
    private String  userName;
    private String  email;
    private Date gmtCreate;
    //getter setter ......


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}