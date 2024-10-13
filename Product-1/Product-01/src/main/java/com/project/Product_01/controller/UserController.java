package com.project.Product_01.controller;

import com.project.Product_01.data.dto.CreateUserDto;
import com.project.Product_01.data.dto.ResponseStructure;
import com.project.Product_01.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/user/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;

    @PostMapping
    public ResponseEntity<ResponseStructure> createUser(@RequestBody CreateUserDto createUserDto) {
        return userServices.createUser(createUserDto);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<ResponseStructure> getUserById(@PathVariable Integer userId) {
        return userServices.getUserById(userId);
    }

    @GetMapping
    public ResponseEntity<ResponseStructure> getAllUsers(@RequestParam(defaultValue = "0") Integer pageNo,@RequestParam(defaultValue = "10") Integer pageSize) {
        return userServices.getAllUsers(pageNo, pageSize);
    }
    @PutMapping("/{userId}")
    public ResponseEntity<ResponseStructure> updateUser(@PathVariable Integer userId, @RequestBody CreateUserDto createUserDto) {
        return userServices.updateUser(userId, createUserDto);
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<ResponseStructure> deleteUser(@PathVariable Integer userId){
        return userServices.deleteUserById(userId);
    }
}
