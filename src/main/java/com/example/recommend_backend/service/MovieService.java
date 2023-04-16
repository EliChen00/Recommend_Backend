package com.example.recommend_backend.service;

import com.example.recommend_backend.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> findAll();

    List<Movie> findAllByTitle(String title);
    Optional<Movie> findById(Long id);
    Movie findByTitle(String title);
    Movie save(Movie user);

    void deleteByTitle(String title);

    void deleteById(Long id);
}
