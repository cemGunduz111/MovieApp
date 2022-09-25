package com.cem.movieapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tblactoractress")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ActorActress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String gender;
    LocalDate birthDate;
    Integer moviesPlayed;
}
