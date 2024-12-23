package com.example.RishiTraders.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
public class Pumps {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1)
    private Long id;


    String pumpModel ;

    String horsePower ;

    String stage ;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
