package com.data.report.pojo;

import java.util.Date;
import javax.persistence.*;

public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    private String username;

    private String password;

    private Date logintime;

    private Integer isuse;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return logintime
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * @return isuse
     */
    public Integer getIsuse() {
        return isuse;
    }

    /**
     * @param isuse
     */
    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }
}