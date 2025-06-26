package org.example.healthtrack.repository;

import org.example.healthtrack.model.Poids;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoidsRepository extends JpaRepository<Poids, Long> {
}
