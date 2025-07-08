package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.PoidsDto;
import org.example.healthtrack.model.Poids;
import org.example.healthtrack.repository.PoidsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PoidsService {
    private  final PoidsRepository poidsRepository;
    private final ModelMapper modelMapper;

    public PoidsDto create(PoidsDto dto) {
        Poids poids = modelMapper.map(dto, Poids.class);
        Poids saved = poidsRepository.save(poids);
        return modelMapper.map(saved, PoidsDto.class);
    }

    public PoidsDto update(Long id, PoidsDto dto) {
        Poids poids = poidsRepository.findById(id).get();

        poids.setDatePoids(dto.getDatePoids());
        poids.setValeur(dto.getValeur());
        Poids saved = poidsRepository.save(poids);

        return modelMapper.map(saved, PoidsDto.class);
    }

    public List<PoidsDto> GetAll() {
        List<Poids> poids = poidsRepository.findAll();
        return poids
                .stream()
                .map(p->modelMapper
                        .map(p, PoidsDto.class))
                .collect(Collectors.toList());

    }
    public void delete(Long id) {
        Poids poids = poidsRepository.findById(id).get();
    }
}
