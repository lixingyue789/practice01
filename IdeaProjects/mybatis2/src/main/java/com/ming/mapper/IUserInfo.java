package com.ming.mapper;

import com.ming.po.UserInfo;

import java.util.List;

public interface IUserInfo {

   UserInfo queryUserInfoById(int myid) throws Exception;

}