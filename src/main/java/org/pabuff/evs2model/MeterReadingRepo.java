package org.pabuff.evs2model;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingRepo extends ListCrudRepository<MeterReadingModel, Long> {}
