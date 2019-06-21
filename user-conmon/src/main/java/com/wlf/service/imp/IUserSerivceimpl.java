package com.wlf.service.imp;

import com.wlf.domain.User;
import com.wlf.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class IUserSerivceimpl implements IUserService {
    @Override
    public User getUserById(Long id) {
        return new User(id,"王龙飞","12345"+id);
    }
}
