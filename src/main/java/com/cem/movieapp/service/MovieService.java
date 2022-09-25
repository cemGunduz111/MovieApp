package com.cem.movieapp.service;

import com.cem.movieapp.repository.IMovieRepository;
import com.cem.movieapp.repository.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final IMovieRepository movieRepository;

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }
    public List<Movie> findAll(){
        return movieRepository.findAll();
    }
    public Movie findTopByOrderByTotalRewardsDesc(){
        return movieRepository.findTopByOrderByTotalRewardsDesc();
    }
}
