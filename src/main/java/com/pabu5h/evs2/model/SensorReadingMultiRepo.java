package com.pabu5h.evs2.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorReadingMultiRepo extends CrudRepository<SensorReadingMultiModel, Long> {
}
