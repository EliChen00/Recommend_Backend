package com.example.recommend_backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long user_id;
    private long movie_id;
    private long rating;
}
