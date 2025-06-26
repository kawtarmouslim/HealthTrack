package org.example.healthtrack.repository;

import org.example.healthtrack.model.Alimentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentationRepository extends JpaRepository<Alimentation, Long> {
}
