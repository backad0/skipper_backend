package com.backend.tinkoff_backend.repositories;

import com.backend.tinkoff_backend.entities.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}
