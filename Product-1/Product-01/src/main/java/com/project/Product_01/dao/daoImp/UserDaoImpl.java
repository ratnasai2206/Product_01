package com.project.Product_01.dao.daoImp;

import com.project.Product_01.dao.UserDao;
import com.project.Product_01.data.entity.User;
import com.project.Product_01.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;
import java.util.Objects;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {


    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
    }

    @Override
    public Page<User> GetAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deleteUser(User user) {
        if (Objects.nonNull(user)) {
            userRepository.delete(user);
            return true;
        }
        return false;
    }
}
