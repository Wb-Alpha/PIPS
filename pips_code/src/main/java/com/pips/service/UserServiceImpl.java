package com.pips.service;

import com.pips.dao.UserDao;
import com.pips.dao.UserDaoImpl;
import com.pips.pojo.User;

public class UserServiceImpl implements UserService{
    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public User queryUserById(String id) {
        return userDao.getUserById(id);
    }
}
