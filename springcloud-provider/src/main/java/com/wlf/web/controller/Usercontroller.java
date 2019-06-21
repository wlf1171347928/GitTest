package com.wlf.web.controller;

import com.wlf.domain.User;
import com.wlf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @Autowired
    private IUserService service;

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable Long id ){
        return service.getUserById(id);
    }
}
