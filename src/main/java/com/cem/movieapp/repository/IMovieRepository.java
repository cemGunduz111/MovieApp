package com.cem.movieapp.repository;

import com.cem.movieapp.repository.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Long> {

    // En yüksek ödül sayısı olan filmi getirir
    Movie findTopByOrderByTotalRewardsDesc();


}
