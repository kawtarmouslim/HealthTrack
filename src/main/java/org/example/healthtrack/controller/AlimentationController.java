package org.example.healthtrack.controller;

import org.example.healthtrack.dto.AlimentationDto;
import org.example.healthtrack.dto.BesoinCaloriqueDTO;
import org.example.healthtrack.dto.RepartitionCaloriqueDTO;
import org.example.healthtrack.services.AlimentationService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/api/alimentations")
public class AlimentationController {



        private final AlimentationService alimentationService;

        public AlimentationController(AlimentationService alimentationService) {
            this.alimentationService = alimentationService;
        }

        // CREATE
        @PostMapping
        public ResponseEntity<AlimentationDto> create(@RequestBody AlimentationDto dto) {
            AlimentationDto created = alimentationService.createAlimentation(dto);
            return ResponseEntity.ok(created);
        }

        // READ all
        @GetMapping
        public ResponseEntity<List<AlimentationDto>> getAll() {
            return ResponseEntity.ok(alimentationService.getAllAlimentations());
        }

        // UPDATE
        @PutMapping("/{id}")
        public ResponseEntity<AlimentationDto> update(@PathVariable Long id, @RequestBody AlimentationDto dto) {
            AlimentationDto updated = alimentationService.updateAlimentation(id, dto);
            return ResponseEntity.ok(updated);
        }

        // DELETE
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete(@PathVariable Long id) {
            alimentationService.deleteAlimentation(id);
            return ResponseEntity.noContent().build();
        }


        @GetMapping("/repartition")
        public ResponseEntity<List<RepartitionCaloriqueDTO>> getRepartition(
                @RequestParam Long utilisateurIdUtilisateur,
                @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
            return ResponseEntity.ok(alimentationService.getCaloriesParRepasParJour(utilisateurIdUtilisateur, date));
        }
    @GetMapping("/bilan/{userId}/{date}")
    public ResponseEntity<BesoinCaloriqueDTO> getBilan(
            @PathVariable Long userId,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(alimentationService.getBilanCaloriqueJournalier(userId, date));
    }

}


