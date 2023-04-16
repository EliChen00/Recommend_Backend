package com.example.recommend_backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movie_id;

    private String title;
    private String date;
}
