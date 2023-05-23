package com.pips.service;

import com.pips.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User queryUserById(String id);

    int validateUser(User user);
}
