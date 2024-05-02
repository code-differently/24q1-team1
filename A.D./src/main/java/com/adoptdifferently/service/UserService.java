package com.adoptdifferently.service;

import com.adoptdifferently.model.User;

import java.util.List;

public interface UserService {
    
    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(long userId);

    User getUserById(long userId);

    List<User> getAllUsers();
}
