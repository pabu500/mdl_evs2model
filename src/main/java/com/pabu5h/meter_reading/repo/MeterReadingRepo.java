package com.pabu5h.meter_reading.repo;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import com.pabu5h.meter_reading.entity.MeterReadingModel;

@Repository
public interface MeterReadingRepo extends ListCrudRepository<MeterReadingModel, Long> {
}
