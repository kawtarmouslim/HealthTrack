package org.example.healthtrack.repository;

import org.example.healthtrack.model.Humeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumeurRepository extends JpaRepository<Humeur, Long> {
}
