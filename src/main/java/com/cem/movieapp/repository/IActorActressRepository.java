package com.cem.movieapp.repository;

import com.cem.movieapp.repository.entity.ActorActress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorActressRepository extends JpaRepository<ActorActress, Long> {

    // En az filmde oynayan oyuncu
    ActorActress findTopByOrderByMoviesPlayedAsc();
}
