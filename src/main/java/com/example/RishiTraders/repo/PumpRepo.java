package com.example.RishiTraders.repo;

import com.example.RishiTraders.models.Pumps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PumpRepo extends JpaRepository<Pumps, Long> {
}
