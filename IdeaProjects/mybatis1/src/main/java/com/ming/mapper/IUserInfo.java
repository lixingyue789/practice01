package com.ming.mapper;


import com.ming.BZ.UserInfoBZ;
import com.ming.po.UserInfo;
import com.ming.po.UserInfoEx;

import java.util.List;

public interface IUserInfo {

    public void updateUserInfo(UserInfo userInfo) throws Exception;
    public void delUserInfo(int id) throws Exception;

    public UserInfoEx queryByUserinfoFromMultiCondition(UserInfoBZ userInfoBZ)throws  Exception;

    public int queryUserInfoByCondition(UserInfoBZ userInfoBZ)throws Exception;

    public UserInfo queryUserInfo(UserInfoBZ userInfoBZ)throws Exception;

    public List<UserInfoEx> queryUserInfo2(UserInfoBZ userInfoBZ) throws  Exception;

    public List<UserInfo> loopTest(UserInfoBZ userInfoBZ) throws Exception;
}
