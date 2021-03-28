package com.caicai.service;


import com.caicai.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserDetailById(Integer id);

    Integer createUser(User user);
}
