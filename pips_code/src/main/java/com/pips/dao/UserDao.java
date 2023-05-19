package com.pips.dao;

import com.pips.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    User getUserById(String id);

    void addUser(User user);

    void deleteUserById(String id);

    void getAllUsers();

    void updateUser(User user);
}
