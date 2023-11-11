package com.academy.academybikes.controller;

import com.academy.academybikes.entity.Journey;
import com.academy.academybikes.entity.Station;
import com.academy.academybikes.service.JourneyService;
import com.academy.academybikes.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Station> getAllStations() {
        return stationService.getAllStations();
    }

    @GetMapping("/{stationId}/journeys")
    public List<Journey> getStationJourneys(@PathVariable Long stationId) {
        return journeyService.getAllJourneysByStationId(stationId);
    }
}
