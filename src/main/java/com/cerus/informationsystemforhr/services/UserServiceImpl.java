package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.Role;
import com.cerus.informationsystemforhr.models.User;
import com.cerus.informationsystemforhr.repositories.UserRepository;
import com.cerus.informationsystemforhr.services.security.UserDetailsServiceImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public User getAuthUser() {
        return userDetailsService.getAuthUser();
    }

    @Override
    public void updateUser(User userOld, User userUpdate) {

        userOld.setUsername(userUpdate.getUsername());
        userOld.setPassword(userUpdate.getPassword());

        userRepository.save(userOld);
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
