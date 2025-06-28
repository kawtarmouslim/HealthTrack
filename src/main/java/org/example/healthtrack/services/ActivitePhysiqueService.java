package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.repository.ActivitePhysiqueRepository;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class ActivitePhysiqueService {
    public ActivitePhysiqueService(ActivitePhysiqueRepository activitePhysiqueRepository) {
        this.activitePhysiqueRepository = activitePhysiqueRepository;
    }

    private final ActivitePhysiqueRepository activitePhysiqueRepository;
}
