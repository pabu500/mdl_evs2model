package org.pabuff.model;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingIwowRepo extends ListCrudRepository<MeterReadingModel, Long> {
}
