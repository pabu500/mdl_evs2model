package org.pabuff.model;

//Spring Boot 2.5+
import org.springframework.data.repository.CrudRepository;
//Spring Boot 3.0+
//import org.springframework.data.repository.ListCrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingRepo extends CrudRepository<MeterReadingModel, Long> {
//Spring Boot 3.0+
//ListCrudRepository<MeterReadingModel, Long> {
}
