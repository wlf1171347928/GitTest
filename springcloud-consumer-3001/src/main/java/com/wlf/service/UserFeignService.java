package com.wlf.service;

import com.wlf.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* @FeignClient表示是feign负载均衡的客户端
*
* */
@FeignClient(value = "USER-PROVIDER")
public interface UserFeignService {

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id);
}
