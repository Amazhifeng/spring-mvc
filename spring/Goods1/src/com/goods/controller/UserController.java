package com.goods.controller;

import com.goods.service.LoginResult;
import com.goods.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String login(String username, String pwd, HttpSession session, Model model){
        LoginResult loginResult = userService.userResult(username, pwd);
         if (loginResult.success) {
            session.setAttribute("user",loginResult.getUser());
            return "redirect:/choose.jsp";
        }else {
            model.addAttribute("uspderror", loginResult.getLoginResult());
            return "index";
        }
    }
}
