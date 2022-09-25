package com.cem.movieapp.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbldirector")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    Integer totalRewards;
    Integer age;
    Integer moviesDirected;
}
