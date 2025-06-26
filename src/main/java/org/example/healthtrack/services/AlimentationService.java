package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.AlimentationDto;
import org.example.healthtrack.model.Alimentation;
import org.example.healthtrack.repository.AlimentationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AlimentationService {
    private final AlimentationRepository alimentationRepository;
    private  final ModelMapper modelMapper;
    public AlimentationDto createAlimentation(AlimentationDto alimentationDto) {
        Alimentation alimentation=modelMapper.map(alimentationDto, Alimentation.class);
        Alimentation savedAlimentation=alimentationRepository.save(alimentation);
        return modelMapper.map(savedAlimentation, AlimentationDto.class);
    }

}
