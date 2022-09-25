package com.cem.movieapp.controller;


import com.cem.movieapp.repository.entity.Director;
import com.cem.movieapp.service.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/director")
public class DirectorController {

    private final DirectorService directorService;

    // http://localhost:9091/director/save
    @GetMapping("/save")
    public ResponseEntity<Director> save(String name, String surname, Integer totalRewards, Integer age, Integer moviesDirected){
        Director director = directorService.save(Director.builder()
                .name(name)
                .surname(surname)
                .totalRewards(totalRewards)
                .age(age)
                .moviesDirected(moviesDirected)
                .build());
        return ResponseEntity.ok(director);
    }

    // http://localhost:9091/director/findall
    @GetMapping("/findall")
    public ResponseEntity<List<Director>> findAll(){
        return ResponseEntity.ok(directorService.findAll());
    }

    // http://localhost:9091/director/findbymoviesdirected?number=
    @GetMapping("/findbymoviesdirected")
    public ResponseEntity<Optional<List<Director>>> findAllOptionalByMoviesDirectedGreaterThan(Integer number){
        return ResponseEntity.ok(directorService.findAllOptionalByMoviesDirectedGreaterThan(number));
    }
}
