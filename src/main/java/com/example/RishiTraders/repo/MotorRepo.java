package com.example.RishiTraders.repo;

import com.example.RishiTraders.models.Motors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorRepo extends JpaRepository<Motors, Long> {

}
