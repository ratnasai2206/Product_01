package com.project.Product_01.services.servicesImpl;

import com.project.Product_01.dao.UserDao;
import com.project.Product_01.data.dto.ResponseStructure;
import com.project.Product_01.data.entity.User;
import com.project.Product_01.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserDao userDao;

    @Override
    public ResponseEntity<ResponseStructure> createUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseStructure> getUserById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseStructure> updateUser(User user) {
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
