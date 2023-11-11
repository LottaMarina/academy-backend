package com.academy.academybikes.repository;

import com.academy.academybikes.entity.Journey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JourneyRepository extends JpaRepository<Journey, Long> {
    List<Journey> findByDepartureStationIdOrReturnStationId(Long departureStationId, Long returnStationId);
}
