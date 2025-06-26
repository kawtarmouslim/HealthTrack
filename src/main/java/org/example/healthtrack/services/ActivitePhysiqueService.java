package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.repository.ActivitePhysiqueRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ActivitePhysiqueService {
    private final ActivitePhysiqueRepository activitePhysiqueRepository;
}
