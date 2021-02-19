package com.example.app.service;

import com.example.app.entity.User;
import com.example.app.model.user.UserRequest;
import com.example.app.model.user.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserResponse create (UserRequest userRequest);
    List<User> getUser();
    Optional<User> findUserById(Long id);
}
