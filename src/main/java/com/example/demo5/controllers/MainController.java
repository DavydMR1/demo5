package com.example.demo5.controllers;

import com.example.demo5.Services.AdminService;
import com.example.demo5.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class MainController {
    private AdminService adminService;
    private UserService userService;
}
