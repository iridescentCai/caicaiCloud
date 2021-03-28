package com.caicai.dao;

import com.caicai.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    Integer createUser(User user);

    User getUserById(@Param("id") Integer id);
}
