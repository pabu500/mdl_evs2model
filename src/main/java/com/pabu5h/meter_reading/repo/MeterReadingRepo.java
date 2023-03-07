package com.pabu5h.meter_reading.repo;

//Spring Boot 2.5+
import org.springframework.data.repository.CrudRepository;
//Spring Boot 3.0+
//import org.springframework.data.repository.ListCrudRepository;

import org.springframework.stereotype.Repository;
import com.pabu5h.meter_reading.entity.MeterReadingModel;

@Repository
public interface MeterReadingRepo extends CrudRepository<MeterReadingModel, Long> {
//Spring Boot 3.0+
//ListCrudRepository<MeterReadingModel, Long> {
}
