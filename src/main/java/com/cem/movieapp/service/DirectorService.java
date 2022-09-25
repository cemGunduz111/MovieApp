package com.cem.movieapp.service;

import com.cem.movieapp.repository.IDirectorRepository;
import com.cem.movieapp.repository.entity.Director;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DirectorService {

    private final IDirectorRepository directorRepository;

    public Director save(Director director){
        return directorRepository.save(director);
    }

    public List<Director> findAll(){
        return directorRepository.findAll();
    }

    public Optional<List<Director>> findAllOptionalByMoviesDirectedGreaterThan(Integer number){
        return directorRepository.findAllOptionalByMoviesDirectedGreaterThan(number);
    }
}
