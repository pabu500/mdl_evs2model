package com.pabu5h.evs2.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingProcessingRepo extends CrudRepository<MeterReadingProcessingModel, Long> {
}
