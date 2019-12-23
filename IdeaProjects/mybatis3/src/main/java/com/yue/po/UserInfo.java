package com.yue.po;

/**
 * Author:lxy1999
 * Created:2019/8/4
 */
public class UserInfo {
    private String userid;

    private String username;

    public UserInfo() {
    }

    public UserInfo(String userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
