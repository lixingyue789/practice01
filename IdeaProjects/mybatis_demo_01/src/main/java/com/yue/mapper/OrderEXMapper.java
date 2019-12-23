package com.yue.mapper;

import com.yue.po.Orders;
import com.yue.po.OrdersEX;

import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/8
 */
public interface OrderEXMapper {

    public List<OrdersEX> queryOrderUser()throws Exception;

    public List<Orders> queryOrderUserResultMap() throws Exception;
}
