package org.pabuff.model;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReading3pRepo extends ListCrudRepository<MeterReading3pModel, Long> {}
