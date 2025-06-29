package org.example.healthtrack.repository;

import org.example.healthtrack.dto.RepartitionCaloriqueDTO;
import org.example.healthtrack.model.Alimentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AlimentationRepository extends JpaRepository<Alimentation, Long> {
    @Query("SELECT new org.example.healthtrack.dto.RepartitionCaloriqueDTO(a.repas, SUM(a.calorie)) " +
            "FROM Alimentation a " +
            "WHERE a.utilisateur.idUtilisateur = :userId AND DATE(a.dateAlimentation) = :date " +
            "GROUP BY a.repas")
    List<RepartitionCaloriqueDTO> getCaloriesParRepasParJour(@Param("userId") Long userId, @Param("date") LocalDate date);
    @Query("SELECT SUM(a.calorie) FROM Alimentation a WHERE a.utilisateur.idUtilisateur = :userId AND DATE(a.dateAlimentation) = :date")
    Optional<Integer> getCaloriesTotalesParJour(@Param("userId") Long userId, @Param("date") LocalDate date);


}
