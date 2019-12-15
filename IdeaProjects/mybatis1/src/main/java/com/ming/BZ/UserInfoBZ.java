package com.ming.BZ;

import com.ming.po.UserInfoEx;

import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/6
 */
public class UserInfoBZ  {
    private UserInfoEx userInfoEx;

    private List<Integer> multyIds;

    public UserInfoBZ() {
    }

    public List<Integer> getMultyIds() {
        return multyIds;
    }

    public void setMultyIds(List<Integer> multyIds) {
        this.multyIds = multyIds;
    }

    public UserInfoEx getUserInfoEx() {
        return userInfoEx;
    }

    public void setUserInfoEx(UserInfoEx userInfoEx) {
        this.userInfoEx = userInfoEx;
    }
}
