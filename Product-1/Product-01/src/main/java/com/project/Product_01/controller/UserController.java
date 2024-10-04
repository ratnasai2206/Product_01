package com.project.Product_01.controller;

import com.project.Product_01.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;
}
