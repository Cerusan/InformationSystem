package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.Role;
import com.cerus.informationsystemforhr.models.User;
import com.cerus.informationsystemforhr.repositories.UserRepository;
import com.cerus.informationsystemforhr.services.security.UserDetailsServiceImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsServiceImpl userDetailsService;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, UserDetailsServiceImpl userDetailsService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
    }

    @Override
    public void register(User user) {
        User userReg = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()), Role.ROLE_USER);

        userRepository.save(userReg);
    }

    @Override
    public User getAuthUser() { //TODO think about do I really need it?
        return null;
    }

    @Override
    public void updateUser(int userId, User userUpdate) {
        User user = userRepository.findById(userId).get();
        //user.
        //TODO - should I change login?
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }
}
