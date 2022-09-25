package com.cem.movieapp.utility;


import com.cem.movieapp.repository.IActorActressRepository;
import com.cem.movieapp.repository.IDirectorRepository;
import com.cem.movieapp.repository.IMovieRepository;
import com.cem.movieapp.repository.entity.ActorActress;
import com.cem.movieapp.repository.entity.Director;
import com.cem.movieapp.repository.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DefaultDataImpl {

    private final IActorActressRepository actorActressRepository;
    private final IDirectorRepository directorRepository;
    private final IMovieRepository movieRepository;

    @PostConstruct
    private void create(){
        saveActorActress();
        saveDirector();
        saveMovie();
    }

    private void saveMovie(){
        Movie movie = Movie.builder()
                .name("Iron Man")
                .genre("Action, Sci-Fi")
                .totalRewards(21)
                .runTime("2 hours 6 minutes")
                .directorId(4L)
                .actorId(1L)
                .build();
        Movie movie2 = Movie.builder()
                .name("Captain America: The Winter Soldier")
                .genre("Action, Sci-Fi")
                .totalRewards(5)
                .runTime("2 hours 16 minutes")
                .directorId(2L)
                .actorId(2L)
                .build();
        Movie movie3 = Movie.builder()
                .name("Thor: Ragnarok")
                .genre("Action, Comedy")
                .totalRewards(6)
                .runTime("2 hours 10 minutes")
                .directorId(3L)
                .actorId(3L)
                .build();
        Movie movie4 = Movie.builder()
                .name("Wind River")
                .genre("Crime, Drama, Mystery")
                .totalRewards(15)
                .runTime("1 hour 47 minutes")
                .directorId(5L)
                .actorId(4L)
                .build();
        Movie movie5 = Movie.builder()
                .name("Marriage Story")
                .genre("Drama, Romance")
                .totalRewards(128)
                .runTime("2 hours 17 minutes")
                .directorId(6L)
                .actorId(6L)
                .build();
        Movie movie6 = Movie.builder()
                .name("Dark Waters")
                .genre("Biography, Drama, History")
                .totalRewards(0)
                .runTime("2 hours 6 minutes")
                .directorId(1L)
                .actorId(5L)
                .build();
        movieRepository.saveAll(Arrays.asList(movie,movie2,movie3,movie4,movie5,movie6));
    }
    private void saveDirector(){
        Director director = Director.builder()
                .name("Todd")
                .surname("Haynes")
                .totalRewards(61)
                .age(61)
                .moviesDirected(22)
                .build();
        Director director2 = Director.builder()
                .name("Joe")
                .surname("Russo")
                .totalRewards(8)
                .age(51)
                .moviesDirected(28)
                .build();
        Director director3 = Director.builder()
                .name("Taika")
                .surname("Waititi")
                .totalRewards(80)
                .age(47)
                .moviesDirected(29)
                .build();
        Director director4 = Director.builder()
                .name("John")
                .surname("Favreau")
                .totalRewards(11)
                .age(56)
                .moviesDirected(26)
                .build();
        Director director5 = Director.builder()
                .name("Taylor")
                .surname("Sheridan")
                .totalRewards(24)
                .age(53)
                .moviesDirected(7)
                .build();
        Director director6 = Director.builder()
                .name("Noah")
                .surname("Baumbach")
                .totalRewards(48)
                .age(53)
                .moviesDirected(16)
                .build();
        directorRepository.saveAll(Arrays.asList(director,director2,director3,director4,director5,director6));
    }
    private void saveActorActress(){
        ActorActress actorActress = ActorActress.builder()
                .name("Robert")
                .surname("Downey Jr.")
                .gender("Male")
                .birthDate(LocalDate.parse("1965-04-04"))
                .moviesPlayed(93)
                .build();
        ActorActress actorActress2 = ActorActress.builder()
                .name("Chris")
                .surname("Evans")
                .gender("Male")
                .birthDate(LocalDate.parse("1981-06-13"))
                .moviesPlayed(58)
                .build();
        ActorActress actorActress3 = ActorActress.builder()
                .name("Chris")
                .surname("Hemsworth")
                .gender("Male")
                .birthDate(LocalDate.parse("1983-08-11"))
                .moviesPlayed(49)
                .build();
        ActorActress actorActress4 = ActorActress.builder()
                .name("Elizabeth")
                .surname("Olsen")
                .gender("Female")
                .birthDate(LocalDate.parse("1989-02-16"))
                .moviesPlayed(26)
                .build();
        ActorActress actorActress5 = ActorActress.builder()
                .name("Mark")
                .surname("Ruffalo")
                .gender("Male")
                .birthDate(LocalDate.parse("1967-11-22"))
                .moviesPlayed(78)
                .build();
        ActorActress actorActress6 = ActorActress.builder()
                .name("Scarlett")
                .surname("Johansson")
                .gender("Female")
                .birthDate(LocalDate.parse("1984-11-22"))
                .moviesPlayed(75)
                .build();
        actorActressRepository.saveAll(Arrays.asList(actorActress,actorActress2,actorActress3,actorActress4,actorActress5,actorActress6));
    }
}
