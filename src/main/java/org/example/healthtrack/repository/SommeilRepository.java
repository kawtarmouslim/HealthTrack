package org.example.healthtrack.repository;

import org.example.healthtrack.model.Sommeil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SommeilRepository extends JpaRepository<Sommeil, Long> {
}
