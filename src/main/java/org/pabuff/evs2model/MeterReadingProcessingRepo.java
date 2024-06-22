package org.pabuff.evs2model;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingProcessingRepo extends ListCrudRepository<MeterReadingProcessingModel, Long> {

}
