package com.example.recommend_backend.service.Impl;

import com.example.recommend_backend.entity.User;
import com.example.recommend_backend.repository.UserRepository;
import com.example.recommend_backend.service.UserService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllByOccupation(String occupation) {
        return userRepository.findAllByOccupationContains(occupation);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User save(User user) {
        User existUser = userRepository.findByName(user.getName());
        if(existUser!=null)
            user.setUser_id(existUser.getUser_id());
        return userRepository.save(user);
    }

    @Override
    public void deleteByName(String name) {
        userRepository.deleteByName(name);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
