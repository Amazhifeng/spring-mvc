package com.goods.controller;

import com.goods.domain.Order;
import com.goods.domain.User;
import com.goods.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class OrderController {
    @Resource
    private OrderService orderService;
    @RequestMapping("addOrder")
    public String addOrder(HttpSession session, Order order){
        User user = (User)session.getAttribute("user");
        order.setUserid(user.getUserid());

        boolean b = orderService.addOrder(order);
        if (b) {
            return "redirect:/choose.jsp?resultIfo=订单添加成功！";
        }else{
            return "redirect:/choose.jsp?resultIfo=订单添加失败！";
        }
    }

    @RequestMapping("showorder")
    public String showOrders(HttpSession session,@RequestParam(required = false,defaultValue = "1") String pagNow){
        User user = (User)session.getAttribute("user");

        int orderTotlePage = orderService.getOrderTotlePage(user);
        List orderList = orderService.getOrderList(user, pagNow);

        session.setAttribute("list",orderList);
        session.setAttribute("pagNow",pagNow);
        session.setAttribute("totlePag",orderTotlePage);

        return "redirect:/showorder.jsp";
    }

}
