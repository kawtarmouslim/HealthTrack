package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.AlimentationDto;
import org.example.healthtrack.dto.RepartitionCaloriqueDTO;
import org.example.healthtrack.model.Alimentation;
import org.example.healthtrack.repository.AlimentationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
//@AllArgsConstructor
public class AlimentationService {
    private final AlimentationRepository alimentationRepository;
    private  final ModelMapper modelMapper;

    public AlimentationService(AlimentationRepository alimentationRepository, ModelMapper modelMapper) {
        this.alimentationRepository = alimentationRepository;
        this.modelMapper = modelMapper;
    }

    public AlimentationDto createAlimentation(AlimentationDto alimentationDto) {
        Alimentation alimentation=modelMapper.map(alimentationDto, Alimentation.class);
        Alimentation savedAlimentation=alimentationRepository.save(alimentation);
        return modelMapper.map(savedAlimentation, AlimentationDto.class);
    }
     public List<AlimentationDto> getAllAlimentations() {
        List<Alimentation> alimentations=alimentationRepository.findAll();
        return alimentations
                .stream()
                .map(x->modelMapper.map(x, AlimentationDto.class))
                .collect(Collectors.toList());
     }
     public AlimentationDto updateAlimentation(Long id,AlimentationDto alimentationDto) {
        alimentationRepository.findById(id);
        Alimentation alimentation=modelMapper.map(alimentationDto, Alimentation.class);
        alimentation.setRepas(alimentationDto.getRepas());
        alimentation.setCalorie(alimentationDto.getCalorie());
        alimentation.setDateAlimentation(alimentationDto.getDateAlimentation());
        alimentationRepository.save(alimentation);
        return modelMapper.map(alimentation, AlimentationDto.class);
     }
     public void deleteAlimentation(Long id) {
        alimentationRepository.deleteById(id);
     }
    public List<RepartitionCaloriqueDTO> getCaloriesParRepasParJour(Long userId, LocalDate date) {
        return alimentationRepository.getCaloriesParRepasParJour(userId, date);
    }

}
