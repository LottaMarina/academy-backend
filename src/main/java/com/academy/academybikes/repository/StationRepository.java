package com.academy.academybikes.repository;

import com.academy.academybikes.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}