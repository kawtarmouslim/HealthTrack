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

@Repository
public interface AlimentationRepository extends JpaRepository<Alimentation, Long> {
    @Query("SELECT a.repas, SUM(a.calorie) " +
            "FROM Alimentation a WHERE a.utilisateur.idUtilisateur = :userId AND DATE(a.dateAlimentation) = :date " +
            "GROUP BY a.repas")
    List<RepartitionCaloriqueDTO> getCaloriesParRepasParJour(@Param("userId") Long userId, @Param("date") LocalDate date);


}
