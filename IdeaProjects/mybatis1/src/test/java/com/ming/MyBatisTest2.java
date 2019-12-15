package com.ming;


import com.ming.BZ.UserInfoBZ;
import com.ming.mapper.IUserInfo;
import com.ming.po.UserInfo;
import com.ming.po.UserInfoEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//动态代理
public class MyBatisTest2 {

    private SqlSessionFactory sqlSessionFactory = null;
    private SqlSession sqlSession = null;

    @Before
    public void testInit(){
        String file = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void updateUserInfo(){
        try {

            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            UserInfo userInfo = new UserInfo();
            userInfo.setUserid(5);
            userInfo.setUsername("oo");
            iUserInfo.updateUserInfo(userInfo);
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
           sqlSession.close();
        }
    }

    @Test
    public void delUserInfo(){
        try {
            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            iUserInfo.delUserInfo(4);
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testqueryByUserinfoFromMultiCondition(){
        try {
            UserInfoEx userInfoEx = new UserInfoEx();
            userInfoEx.setUserid(5);
            userInfoEx.setUsername("oo");
            UserInfoBZ userInfoBZ = new UserInfoBZ();
            userInfoBZ.setUserInfoEx(userInfoEx);
            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            UserInfoEx userInfoEX1=iUserInfo.queryByUserinfoFromMultiCondition(userInfoBZ);
            System.out.println(userInfoEX1);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testqueryUserInfoByCondition(){
        try {
            UserInfoEx userInfoEx = new UserInfoEx();
            userInfoEx.setUsername("ing");
            userInfoEx.setUsersex("m");
            UserInfoBZ userInfoBZ = new UserInfoBZ();
            userInfoBZ.setUserInfoEx(userInfoEx);
            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            int flag = iUserInfo.queryUserInfoByCondition(userInfoBZ);
            System.out.println("flag =" +flag);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testqueryUserInfo(){
        try {
            UserInfoEx userInfoEx = new UserInfoEx();
            userInfoEx.setUsername("ing2");
            userInfoEx.setUsersex("m");
            userInfoEx.setUserid(19);
            UserInfoBZ userInfoBZ = new UserInfoBZ();
            userInfoBZ.setUserInfoEx(userInfoEx);
            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            UserInfo userInfo1 = iUserInfo.queryUserInfo(userInfoBZ);
            System.out.println(userInfo1);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testqueryUserInfo2(){
        try {
            UserInfoEx userInfoEx = new UserInfoEx();
            userInfoEx.setUsername("ing");
            userInfoEx.setUsersex("m");
            UserInfoBZ userInfoBZ = new UserInfoBZ();
            userInfoBZ.setUserInfoEx(userInfoEx);
            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            List<UserInfoEx> userInfoEx1 = iUserInfo.queryUserInfo2(userInfoBZ);
            System.out.println(userInfoEx1);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void loopTest(){
        try {
            List<Integer> multIds = new ArrayList<Integer>();
            multIds.add(18);
            multIds.add(19);
            multIds.add(20);
            multIds.add(21);
            multIds.add(22);
            UserInfoBZ userInfoBZ = new UserInfoBZ();
            userInfoBZ.setMultyIds(multIds);
            sqlSession = sqlSessionFactory.openSession();
            IUserInfo iUserInfo = sqlSession.getMapper(IUserInfo.class);
            List<UserInfo> userInfos = iUserInfo.loopTest(userInfoBZ);
            System.out.println(userInfos);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}
