package org.pabuff.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReading3pRepo extends CrudRepository<MeterReading3pModel, Long> {
//Spring Boot 3.0+
//ListCrudRepository<MeterReadingModel, Long> {
}
