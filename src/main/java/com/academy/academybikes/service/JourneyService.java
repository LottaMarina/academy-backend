package com.academy.academybikes.service;

import com.academy.academybikes.entity.Journey;
import com.academy.academybikes.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JourneyService {
    private final JourneyRepository journeyRepository;
    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public List<Journey> getAllJourneysByStationId(Long stationId) {
        return journeyRepository.findByDepartureStationIdOrReturnStationId(stationId, stationId);
    }
}
