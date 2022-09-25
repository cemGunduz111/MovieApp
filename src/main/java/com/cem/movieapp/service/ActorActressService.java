package com.cem.movieapp.service;

import com.cem.movieapp.repository.IActorActressRepository;
import com.cem.movieapp.repository.entity.ActorActress;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorActressService {

    private final IActorActressRepository actorActressRepository;

    public ActorActress save(ActorActress actorActress){
        return actorActressRepository.save(actorActress);
    }

    public List<ActorActress> findAll(){
        return actorActressRepository.findAll();
    }

    public ActorActress findTopByOrderByMoviesPlayedAsc(){
        return actorActressRepository.findTopByOrderByMoviesPlayedAsc();
    }
}
