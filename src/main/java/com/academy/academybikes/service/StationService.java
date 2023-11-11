package com.academy.academybikes.service;

import com.academy.academybikes.entity.Station;
import com.academy.academybikes.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Page<Station> getAllStations(int page, int size, Sort.Direction direction, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, direction, sortBy);
        return stationRepository.findAll(pageable);
    }
}