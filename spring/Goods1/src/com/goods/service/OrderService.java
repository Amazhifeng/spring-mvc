package com.goods.service;

import com.goods.domain.Order;
import com.goods.domain.User;

import java.util.List;

/**
 * Created by 晨曦 on 2019/7/1.
 */
public interface OrderService {
    public int getOrderTotlePage(User user);
    public List getOrderList(User user, String pagNow);
    public boolean addOrder(Order order);

}
