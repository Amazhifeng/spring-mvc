package com.goods.service;

import com.goods.domain.User;

/**
 * Created by 晨曦 on 2019/6/30.
 */
public class LoginResult {
    public boolean success;
    public String loginResult;
    public User user;

    public LoginResult() {
    }

    public LoginResult(boolean success, String loginResult, User user) {
        this.success = success;
        this.loginResult = loginResult;
        this.user = user;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
