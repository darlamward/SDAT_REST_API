package com.keyin.airport;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepo extends CrudRepository<Airport, Long> {
}
