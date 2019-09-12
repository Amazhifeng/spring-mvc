package com.goods.service;

import com.goods.dao.UserDao;
import com.goods.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * Created by 晨曦 on 2019/6/30.
 */
@Service
public class UserServiceImp implements UserService{
    @Resource
    private UserDao userdao;

    @Override
    public LoginResult userResult(String username, String pwd) {
         LoginResult loginResult=new LoginResult();

        //判断用户名或密码是否为空
        if(username.trim().isEmpty()){
            loginResult.setSuccess(false);
            loginResult.setLoginResult("用户名不能为空！");
            return loginResult;
        }
        if(pwd.trim().isEmpty()){
            loginResult.setSuccess(false);
            loginResult.setLoginResult("密码不能为空！");
            return loginResult;
        }

        User user = null;
        try {
            user = userdao.userJDBC(username, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            loginResult.setSuccess(false);
            loginResult.setLoginResult("数据库查询错误！！");
            return loginResult;

        }


        if(user==null){
            loginResult.setSuccess(false);
            loginResult.setLoginResult("用户名或密码错误！");
            return loginResult;
        }

        loginResult.setSuccess(true);
        loginResult.setUser(user);
        return loginResult;
    }
}
