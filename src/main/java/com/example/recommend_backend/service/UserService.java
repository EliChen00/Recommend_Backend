package com.example.recommend_backend.service;

import com.example.recommend_backend.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    List<User> findAllByOccupation(String occupation);
    Optional<User> findById(Long id);
    User findByName(String name);
    User save(User user);

    void deleteByName(String name);

    void deleteById(Long id);
}
