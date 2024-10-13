package com.project.Product_01.services.servicesImpl;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
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
        return ResponseUtil.getCreatedResponse(userDao.createUser(user));
    }

    @Override
    public ResponseEntity<ResponseStructure> getUserById(Integer id) {
        return ResponseUtil.getOkResponse(userDao.getUserById(id));
    }

    @Override
    public ResponseEntity<ResponseStructure> updateUser(Integer userId,CreateUserDto createUser) {

        User user = userDao.getUserById(userId);
        if(user!=null) {
            modelMapper.map(createUser, user);
            return ResponseUtil.getOkResponse(userDao.updateUser(user));
        }
        return ResponseUtil.getOkResponse("User Not Found By this Id");
    }

    @Override
    public ResponseEntity<ResponseStructure> getAllUsers(int pageNo, int pageSize) {
        return ResponseUtil.getOkResponse(userDao.getAllUsers(PageRequest.of(pageNo, pageSize)));
    }

    @Override
    public ResponseEntity<ResponseStructure> deleteUserById(Integer id) {
        User user =userDao.getUserById(id);

        if(user!=null){
            boolean isDelete = userDao.deleteUser(user);
            if(isDelete) {
                return ResponseUtil.getOkResponse("User Deleted Successfully");
            }
            return ResponseUtil.getConflictResponse("User Not Deleted ");
        }
        return  ResponseUtil.getOkResponse("User Not Found By this Id");
    }
}
