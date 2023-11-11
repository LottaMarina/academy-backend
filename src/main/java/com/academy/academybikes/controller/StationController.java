package com.academy.academybikes.controller;

import com.academy.academybikes.entity.Journey;
import com.academy.academybikes.entity.Station;
import com.academy.academybikes.service.JourneyService;
import com.academy.academybikes.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/stations")
public class StationController {

    private final StationService stationService;
    private final JourneyService journeyService;

    @Autowired
    public StationController(StationService stationService, JourneyService journeyService) {
        this.stationService = stationService;
        this.journeyService = journeyService;
    }

    @GetMapping("/")
    public ResponseEntity<Page<Station>> getAllStations(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "ASC") Sort.Direction direction,
            @RequestParam(defaultValue = "stationName") String sortBy
    ) {
        Page<Station> stations = stationService.getAllStations(page, size, direction, sortBy);
        return new ResponseEntity<>(stations, HttpStatus.OK);
    }

    @GetMapping("/{stationId}/journeys")
    public List<Journey> getStationJourneys(@PathVariable Long stationId) {
        return journeyService.getAllJourneysByStationId(stationId);
    }
}
