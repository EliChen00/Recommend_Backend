package com.example.recommend_backend.service;

import com.example.recommend_backend.entity.Rating;

import java.util.List;

public interface RatingService {

    List<Rating> findAll();
    List<Rating> findAllByUserId(long id);
    List<Rating> findAllByMovieId(long id);

    Rating findByUserIdAndMovieId(long uid, long mid);
    Rating save(Rating rating);
    void deleteById(Long id);

}
