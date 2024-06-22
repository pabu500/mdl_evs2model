package org.pabuff.model;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorReadingRepo extends ListCrudRepository<SensorReadingModel, Long> {

}
