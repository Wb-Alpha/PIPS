package com.pips.mapper;

import com.pips.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUserById(String id);

    void addUser(User user);

    void deleteUserById(String id);

    void getAllUsers();

    void updateUser(User user);
}
