package com.yue.po;

/**
 * Author:lxy1999
 * Created:2019/8/8
 */
public class OrdersEX extends Orders{

    private String username;

    private int sex;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrdersEX{" +
                "username='" + username + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
