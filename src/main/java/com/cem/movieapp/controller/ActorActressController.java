package com.cem.movieapp.controller;

import com.cem.movieapp.repository.entity.ActorActress;
import com.cem.movieapp.service.ActorActressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/actoractress")
public class ActorActressController {
    private final ActorActressService actorActressService;

    // http://localhost:9091/actoractress/save
    @GetMapping("/save")
    public ResponseEntity<ActorActress> save(String name, String surname, String gender, String birthDate, Integer moviesPlayed){
        ActorActress actorActress = actorActressService.save(ActorActress.builder()
                .name(name)
                .surname(surname)
                .gender(gender)
                .birthDate(LocalDate.parse(birthDate))
                .moviesPlayed(moviesPlayed)
                .build());
        return ResponseEntity.ok(actorActress);
    }

    // http://localhost:9091/actoractress/findall
    @GetMapping("/findall")
    public ResponseEntity<List<ActorActress>> findAll(){
        return ResponseEntity.ok(actorActressService.findAll());
    }

    // http://localhost:9091/actoractress/findleastplayed
    @GetMapping("/findleastplayed")
    public ResponseEntity<ActorActress> findTopByOrderByMoviesPlayedAsc(){
        return ResponseEntity.ok(actorActressService.findTopByOrderByMoviesPlayedAsc());
    }
}
