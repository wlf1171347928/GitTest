package com.wlf.service;

import com.wlf.domain.User;
import org.springframework.stereotype.Service;


public interface IUserService {
    User getUserById(Long id);
}
