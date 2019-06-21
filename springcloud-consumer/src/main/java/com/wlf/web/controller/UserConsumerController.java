package com.wlf.web.controller;

import com.wlf.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserConsumerController {
    @Autowired
    private RestTemplate template;
    @RequestMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        String url = "http://USER-PROVIDER/user/"+id;
        User user = template.getForObject(url, User.class);
        return user;
    }
}
