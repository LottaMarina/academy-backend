package com.academy.academybikes.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departure_date_time")
    private Timestamp departureDateTime;

    @Column(name = "return_date_time")
    private Timestamp returnDateTime;

    @ManyToOne
    @JoinColumn(name = "departure_station_id", referencedColumnName = "id")
    private Station departureStation;

    @ManyToOne
    @JoinColumn(name = "return_station_id", referencedColumnName = "id")
    private Station returnStation;

    @Column(name = "distance")
    private Integer distance;

    @Column(name = "duration")
    private Integer duration;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Timestamp departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Timestamp getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(Timestamp returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public Station getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(Station departureStation) {
        this.departureStation = departureStation;
    }

    public Station getReturnStation() {
        return returnStation;
    }

    public void setReturnStation(Station returnStation) {
        this.returnStation = returnStation;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
