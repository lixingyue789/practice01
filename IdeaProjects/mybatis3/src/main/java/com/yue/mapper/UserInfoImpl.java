package com.yue.mapper;

import com.yue.po.UserInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.concurrent.Executors;

/**
 * Author:lxy1999
 * Created:2019/8/4
 */
public class UserInfoImpl implements IUserInfo{

    private SqlSessionFactory sqlSessionFactory = null;

    public UserInfoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }


    public UserInfo queryUserInfoById(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserInfo userInfo = sqlSession.selectOne("test.queryUserInfoById",id);
        return userInfo;
    }

    public void addUserInfo(UserInfo userInfo) throws Exception {
       SqlSession sqlSession = sqlSessionFactory.openSession();
       sqlSession.insert("test.addUserInfo",userInfo);
    }
}
