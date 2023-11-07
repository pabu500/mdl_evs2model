package com.pabu5h.evs2.model;

//Spring Boot 2.5+

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorSingleReadingRepo extends CrudRepository<SensorSingleReadingModel, Long> {
//Spring Boot 3.0+
//ListCrudRepository<MeterReadingModel, Long> {
}
