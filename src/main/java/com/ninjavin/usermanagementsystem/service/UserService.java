package com.ninjavin.usermanagementsystem.service;

import com.ninjavin.usermanagementsystem.model.User;

import java.util.List;

public interface UserService {
    boolean deleteUser(Long id);

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(Long id, User user);
}
