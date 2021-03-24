package com.caicai.controller;


import com.caicai.model.User;
import com.caicai.service.UserService;
import com.caicai.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "user")
@Slf4j
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping(value = "/userDetail/{id}")
    public User getUserDetail(@PathVariable Integer id) {
        return userService.getUserDetailById(id);
    }

    @PostMapping(value = "/createUser")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

}
