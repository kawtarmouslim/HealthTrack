package org.example.healthtrack.repository;

import org.example.healthtrack.model.ActivitePhysique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitePhysiqueRepository extends JpaRepository<ActivitePhysique, Long> {
}
