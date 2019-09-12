package com.goods.dao;

import com.goods.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * Created by 晨曦 on 2019/6/30.
 */
@Repository
public interface UserDao {
    @Select("SELECT * FROM user WHERE username=#{username} and userpwd=#{pwd}")
    @ResultMap("userRM")
    public User userJDBC(@Param("username") String username, @Param("pwd") String pwd) throws SQLException;
}
