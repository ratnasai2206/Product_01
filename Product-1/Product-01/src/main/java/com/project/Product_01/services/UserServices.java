package com.project.Product_01.services;

import org.springframework.http.ResponseEntity;

import com.project.Product_01.data.dto.CreateUserDto;
import com.project.Product_01.data.dto.ResponseStructure;


public interface UserServices {

    ResponseEntity<ResponseStructure> createUser(CreateUserDto user);

    ResponseEntity<ResponseStructure> getUserById(Integer id);

    ResponseEntity<ResponseStructure> updateUser(CreateUserDto user);

    ResponseEntity<ResponseStructure> getAllUsers(int pageNo, int pageSize);

    ResponseEntity<ResponseStructure> deleteUserById(Integer id);

}
