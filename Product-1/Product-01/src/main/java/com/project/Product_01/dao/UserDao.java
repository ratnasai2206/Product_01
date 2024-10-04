package com.project.Product_01.dao;

import com.project.Product_01.data.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserDao {

    User createUser(User user);

    User getUserById(Integer id);

    Page<User> GetAllUsers (Pageable pageable);

    User updateUser(User user);

    boolean deleteUser(User user);
}
