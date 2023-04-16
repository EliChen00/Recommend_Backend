package com.example.recommend_backend.repository;

import com.example.recommend_backend.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findAllByUser_id(long id);
    List<Rating> findAllByMovie_id(long id);
    Rating findByUser_idAndMovie_id(long uid, long mid);



}
