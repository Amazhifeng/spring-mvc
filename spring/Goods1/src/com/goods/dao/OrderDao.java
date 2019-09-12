package com.goods.dao;

import com.goods.domain.Order;
import com.goods.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 晨曦 on 2019/6/30.
 */
@Repository
public interface OrderDao {
    @Insert("INSERT INTO user_order VALUES(null,#{fName},#{fPhone},#{fAddress},#{sName},#{sPhone},#{sAddress},#{comments},#{userid})")
    public void addOrder(Order order) throws SQLException;

    @Select("SELECT COUNT(*) FROM user_order WHERE userid=#{userid}")
    public long orderPage(User user) throws SQLException;

    @ResultMap("orderRM")
    @Select("SELECT * FROM user_order WHERE userid=#{user.userid} limit #{startIndex},5")
    public List<Order> orderIfo(@Param("user") User user, @Param("startIndex") int startIndex) throws SQLException;
}
