package com.example.recommend_backend.repository;

import com.example.recommend_backend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAllByTitleContains(String title);
    Movie findByTitle(String title);
    void deleteByTitle(String title);
}
