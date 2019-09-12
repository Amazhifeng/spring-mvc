package com.goods.domain;

/**
 * Created by 晨曦 on 2019/6/24.
 */
public class Order {
    private int orderid;
    private String fName;
    private String fPhone;
    private String fAddress;
    private String sName;
    private String sPhone;
    private String sAddress;
    private String comments;
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Order() {
    }

    public Order(String fName, String fPhone, String fAddress, String sName, String sPhone, String sAddress, String comments) {
        this.fName = fName;
        this.fPhone = fPhone;
        this.fAddress = fAddress;
        this.sName = sName;
        this.sPhone = sPhone;
        this.sAddress = sAddress;
        this.comments = comments;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
