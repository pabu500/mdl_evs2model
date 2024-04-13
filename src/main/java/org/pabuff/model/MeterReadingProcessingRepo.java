package org.pabuff.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingProcessingRepo extends CrudRepository<MeterReadingProcessingModel, Long> {

}
