package com.example.recommend_backend.repository;

import com.example.recommend_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByOccupationContains(String occupation);
    User findByName(String name);

    void deleteByName(String name);
}
