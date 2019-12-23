package com.yue;

import com.yue.po.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

/**
 * Author:lxy1999
 * Created:2019/8/4
 */
public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void  testInit(){
        String file = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
           inputStream = Resources.getResourceAsStream(file);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryUserInfoById(){
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        UserInfo userInfo = sqlSession.selectOne("test.queryUserInfoById",3);
        System.out.println(userInfo);
    }

    @Test
    public void testaddUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid("12");
        userInfo.setUsername("huizi");
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        sqlSession.insert("test.addUserInfo",userInfo);
        sqlSession.commit();
    }
}
