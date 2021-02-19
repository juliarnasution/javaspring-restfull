package com.example.app.service.impl;

import com.example.app.entity.User;
import com.example.app.model.user.UserRequest;
import com.example.app.model.user.UserResponse;
import com.example.app.repository.UserRepository;
import com.example.app.service.UserService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.example.app.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserResponse create(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.name);
        user.setUsername(userRequest.username);
        user.setPassword(MD5.getMD5Encrypt(userRequest.password));
        user.setBirthDate(userRequest.birthDate);
        user.setCreatedAt(new Date());
        userRepository.save(user);
        return new UserResponse(user);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
}
