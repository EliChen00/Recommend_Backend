package com.example.recommend_backend.service.Impl;

import com.example.recommend_backend.entity.Rating;
import com.example.recommend_backend.repository.RatingRepository;
import com.example.recommend_backend.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {

    RatingRepository ratingRepository;
    @Override
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> findAllByUserId(long id) {
        return ratingRepository.findAllByUser_id(id);
    }

    @Override
    public List<Rating> findAllByMovieId(long id) {
        return ratingRepository.findAllByUser_id(id);
    }

    @Override
    public Rating findByUserIdAndMovieId(long uid, long mid) {
        return ratingRepository.findByUser_idAndMovie_id(uid,mid);
    }

    @Override
    public Rating save(Rating rating) {
        Rating existRating = ratingRepository.findByUser_idAndMovie_id(rating.getUser_id(),rating.getUser_id());
        if(existRating!=null)
            rating.setId(existRating.getId());
        return ratingRepository.save(rating);
    }

    @Override
    public void deleteById(Long id) {
        ratingRepository.deleteById(id);
    }
}
