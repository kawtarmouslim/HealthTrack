package org.example.healthtrack.services;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.AlimentationDto;
import org.example.healthtrack.dto.BesoinCaloriqueDTO;
import org.example.healthtrack.dto.RepartitionCaloriqueDTO;
import org.example.healthtrack.model.Alimentation;
import org.example.healthtrack.model.Utilisateur;
import org.example.healthtrack.repository.AlimentationRepository;
import org.example.healthtrack.repository.UtilisateurRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
//@AllArgsConstructor
public class AlimentationService {
    private final AlimentationRepository alimentationRepository;
    private  final ModelMapper modelMapper;
    private final UtilisateurRepository utilisateurRepository;

    public AlimentationService(AlimentationRepository alimentationRepository, ModelMapper modelMapper, UtilisateurRepository utilisateurRepository) {
        this.alimentationRepository = alimentationRepository;
        this.modelMapper = modelMapper;
        this.utilisateurRepository = utilisateurRepository;
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

    public BesoinCaloriqueDTO getBilanCaloriqueJournalier(Long userId, LocalDate date) {

        Utilisateur utilisateur = utilisateurRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));


        int besoin = (int) (utilisateur.getPoids() * 30);


        Integer calories = alimentationRepository
                .getCaloriesTotalesParJour(userId, date)
                .orElse(0);

        return new BesoinCaloriqueDTO(calories, besoin);
    }



}
