package com.cem.movieapp.controller;

import com.cem.movieapp.repository.entity.Movie;
import com.cem.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    // http://localhost:9091/movie/save
    @GetMapping("/save")
    public ResponseEntity<Movie> save(String name, String genre, Integer totalRewards, String runTime, Long directorId, Long actorId){
        Movie movie = movieService.save(Movie.builder()
                .name(name)
                .genre(genre)
                .totalRewards(totalRewards)
                .runTime(runTime)
                .directorId(directorId)
                .actorId(actorId)
                .build());
        return ResponseEntity.ok(movie);
    }

    // http://localhost:9091/movie/findall
    @GetMapping("/findall")
    public ResponseEntity<List<Movie>> findAll(){
        return ResponseEntity.ok(movieService.findAll());
    }

    // http://localhost:9091/movie/findmaxrewards
    @GetMapping("/findmaxrewards")
    public ResponseEntity<Movie> findTopByOrderByTotalRewardsDesc(){
        return ResponseEntity.ok(movieService.findTopByOrderByTotalRewardsDesc());
    }
}
