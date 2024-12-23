package com.example.RishiTraders.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Motors {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1)
    private Long id;

    String motorModel;

    double horsePower;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
