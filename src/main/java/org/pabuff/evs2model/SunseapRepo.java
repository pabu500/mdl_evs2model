package org.pabuff.evs2model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SunseapRepo extends JpaRepository<SunseapModel, Long> {
}
