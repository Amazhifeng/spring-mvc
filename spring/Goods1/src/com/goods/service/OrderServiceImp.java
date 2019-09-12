package com.goods.service;

import com.goods.dao.OrderDao;
import com.goods.domain.Order;
import com.goods.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 晨曦 on 2019/7/1.
 */
@Service
public class OrderServiceImp implements OrderService{
    @Resource
   private OrderDao orderDao;

    public int getOrderTotlePage(User user){
        int totlePag=0;
        long totleNumber = 0;
        try {
            totleNumber = orderDao.orderPage(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        totlePag=(int)Math.ceil(totleNumber*1.0/5);//计算分页显示的页数
        return  totlePag;
    }


    public List getOrderList(User user,String pagNow){
        int startIndex=(Integer.parseInt(pagNow)-1)*5;//计算当前页订单的起始位置
        List<Order> orders = null;
        try {
            orders = orderDao.orderIfo(user, startIndex);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return orders;
    }

    @Override
    public boolean addOrder(Order order) {
        try {
            orderDao.addOrder(order);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
