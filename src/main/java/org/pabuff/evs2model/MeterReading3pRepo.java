package org.pabuff.evs2model;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReading3pRepo extends ListCrudRepository<MeterReading3pModel, Long> {}
