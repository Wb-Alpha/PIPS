package com.pips.service.impl;

import com.pips.mapper.UserMapper;
import com.pips.pojo.User;
import com.pips.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int validateUser(User user) {
        User result = userMapper.getUserById(user.getId());
        if (result==null){  // 用户不存在
            return 1;
        }else if (!result.getPassword().equals(user.getPassword())){
            return 2;   // 密码错误
        }
        return 0;
    }
}
