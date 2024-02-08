package com.cerus.informationsystemforhr.services.security;

import com.cerus.informationsystemforhr.models.User;
import com.cerus.informationsystemforhr.repositories.UserRepository;
import com.cerus.informationsystemforhr.security.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findBYUsername(username);

        if (user.isEmpty()){
            throw new UsernameNotFoundException("Пользователь с таким логином не найден");
        }

        return new UserDetailsImpl(user.get());
    }


}
