package com.yue.mapper;

import com.yue.po.UserInfo;

/**
 * Author:lxy1999
 * Created:2019/8/4
 */
public interface IUserInfo {

    public UserInfo queryUserInfoById(int id) throws Exception;

    public void addUserInfo(UserInfo userInfo)throws Exception;
}
