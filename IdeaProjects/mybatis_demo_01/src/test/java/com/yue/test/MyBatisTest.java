package com.yue.test;

import com.yue.mapper.OrderEXMapper;
import com.yue.po.Orders;
import com.yue.po.OrdersEX;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/8
 */
public class MyBatisTest {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void testInitial(){
        String file = "sqlMapConfig.xml";
        InputStream is = null;
        try {
            is=Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryOrderUser(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        OrderEXMapper orderEXMapper=sqlSession.getMapper(OrderEXMapper.class);
        try {
            List<OrdersEX>ordersEX = orderEXMapper.queryOrderUser();
            System.out.println(ordersEX);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryOrderUserResultMap(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        OrderEXMapper orderEXMapper=sqlSession.getMapper(OrderEXMapper.class);
        try {
            List<OrdersEX> orders = orderEXMapper.queryOrderUser();
            System.out.println(orders);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
