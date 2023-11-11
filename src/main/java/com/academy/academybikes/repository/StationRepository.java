package com.academy.academybikes.repository;

import com.academy.academybikes.entity.Station;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StationRepository extends PagingAndSortingRepository<Station, Long> {
}