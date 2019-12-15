package com.ming.po;

/**
 * 最好不要改变
 * 除了[关联映射]之外不要有任何的变动
 */
public class UserInfo {

   private int userid;

   private String username;

   private String usersex;

   public UserInfo(){

   }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                '}';
    }
}
