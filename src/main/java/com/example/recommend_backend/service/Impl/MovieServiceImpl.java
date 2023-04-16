package com.example.recommend_backend.service.Impl;

import com.example.recommend_backend.entity.Movie;
import com.example.recommend_backend.repository.MovieRepository;
import com.example.recommend_backend.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> findAllByTitle(String title) {
        return movieRepository.findAllByTitleContains(title);
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public Movie save(Movie movie) {
        Movie existMovie = movieRepository.findByTitle(movie.getTitle());
        if(existMovie!=null)
            movie.setMovie_id(existMovie.getMovie_id());
        return movieRepository.save(movie);
    }

    @Override
    public void deleteByTitle(String title) {
        movieRepository.deleteByTitle(title);
    }

    @Override
    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }
}
