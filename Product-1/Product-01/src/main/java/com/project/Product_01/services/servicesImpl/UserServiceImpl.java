package com.project.Product_01.services.servicesImpl;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.Product_01.dao.UserDao;
import com.project.Product_01.data.dto.CreateUserDto;
import com.project.Product_01.data.dto.ResponseStructure;
import com.project.Product_01.data.entity.User;
import com.project.Product_01.services.UserServices;
import com.project.Product_01.utils.ResponseUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserDao userDao;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<ResponseStructure> createUser(CreateUserDto createUser) {
    	User user = modelMapper.map(createUser, User.class);
        return ResponseUtil.getCreatedResponse(user);
    }

    @Override
    public ResponseEntity<ResponseStructure> getUserById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseStructure> updateUser(CreateUserDto user) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseStructure> getAllUsers(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseStructure> deleteUserById(Integer id) {
        return null;
    }
}
