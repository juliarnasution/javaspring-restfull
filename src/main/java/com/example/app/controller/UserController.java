package com.example.app.controller;

import com.example.app.entity.User;
import com.example.app.model.WebResponse;
import com.example.app.model.user.UserRequest;
import com.example.app.model.user.UserResponse;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<UserResponse> createUser (@RequestBody UserRequest userRequest){
        UserResponse userResponse= userService.create(userRequest);
        return new WebResponse(200,"OK",userResponse);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUser();
    }
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }
}
