package com.project.Product_01.services;

import com.project.Product_01.data.dto.ResponseStructure;
import com.project.Product_01.data.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserServices {

    ResponseEntity<ResponseStructure> createUser(User user);

    ResponseEntity<ResponseStructure> getUserById(Integer id);

    ResponseEntity<ResponseStructure> updateUser(User user);

    ResponseEntity<ResponseStructure> getAllUsers(int pageNo, int pageSize);

    ResponseEntity<ResponseStructure> deleteUserById(Integer id);

}
