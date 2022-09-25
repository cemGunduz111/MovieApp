package com.cem.movieapp.repository;

import com.cem.movieapp.repository.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDirectorRepository extends JpaRepository<Director, Long> {

    // Girilen sayıdan fazla film yönetmiş olan yönetmen
    Optional<List<Director>> findAllOptionalByMoviesDirectedGreaterThan(Integer number);
}
