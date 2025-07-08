package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.ActivitePhysiqueDto;
import org.example.healthtrack.model.ActivitePhysique;
import org.example.healthtrack.repository.ActivitePhysiqueRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ActivitePhysiqueService {


    private final ActivitePhysiqueRepository activitePhysiqueRepository;
    private final ModelMapper modelMapper;

    public ActivitePhysiqueDto createActivitePhysiqueDto(ActivitePhysiqueDto activitePhysiqueDto) {
        ActivitePhysique  activitePhysique=modelMapper.map(activitePhysiqueDto, ActivitePhysique.class);
        ActivitePhysique saved=activitePhysiqueRepository.save(activitePhysique);
        return modelMapper.map(saved, ActivitePhysiqueDto.class);
    }
    public ActivitePhysiqueDto update(Long id,ActivitePhysiqueDto activitePhysiqueDto) {
        ActivitePhysique activitePhysique=activitePhysiqueRepository.findById(id).get();

        activitePhysique.setDate(activitePhysiqueDto.getDate());
        activitePhysique.setDuree(activitePhysiqueDto.getDuree());
        activitePhysique.setPas(activitePhysiqueDto.getPas());

        ActivitePhysique saved=activitePhysiqueRepository.save(activitePhysique);
        return modelMapper.map(saved, ActivitePhysiqueDto.class);

    }
    public void delete(Long id) {
        activitePhysiqueRepository.deleteById(id);

    }
    public List<ActivitePhysiqueDto>getAllActivitePhysiqueDto() {
        List<ActivitePhysique> activitePhysiques=activitePhysiqueRepository.findAll();
        return activitePhysiques
                .stream().
                map(a->modelMapper.map(a, ActivitePhysiqueDto.class))
                .collect(Collectors.toList());
    }
}
