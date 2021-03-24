package com.caicai.service.impl;

import com.caicai.dao.UserDao;
import com.caicai.model.User;
import com.caicai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserDetailById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public Integer createUser(User user) {
        return userDao.createUser(user);
    }
}
