package com.example.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "Ini adalah halaman index";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "selamat datang dihalaman admin";
    }
}
