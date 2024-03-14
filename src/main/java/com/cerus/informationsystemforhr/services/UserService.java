package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.User;

import java.util.List;

public interface UserService {

    void register(User user);

    User getAuthUser();

    void updateUser(User userOld, User userUpdate);

    List<User> getAllUsers();

    User getUserById(int id);
}
