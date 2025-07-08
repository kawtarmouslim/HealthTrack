package org.example.healthtrack.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.UtilisateurDto;
import org.example.healthtrack.model.Utilisateur;
import org.example.healthtrack.repository.UtilisateurRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
        private final ModelMapper modelMapper;

        public UtilisateurDto createUtilisateur(UtilisateurDto utilisateurDto) {
            Utilisateur utilisateur=modelMapper.map(utilisateurDto, Utilisateur.class);
            Utilisateur savedUtilisateur=utilisateurRepository.save(utilisateur);
            return modelMapper.map(savedUtilisateur, UtilisateurDto.class);
        }
        public List<UtilisateurDto> getAllUtilisateurs() {
            List<Utilisateur> utilisateurs=utilisateurRepository.findAll();
            return utilisateurs
                    .stream()
                    .map(u->modelMapper.map(u, UtilisateurDto.class))
                    .collect(Collectors.toList());
}
public UtilisateurDto getUtilisateurById(Long id) {
            Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
            return modelMapper.map(utilisateur, UtilisateurDto.class);

}
public UtilisateurDto updateUtilisateur(Long id ,UtilisateurDto utilisateurDto) {
    Utilisateur utilisateur = utilisateurRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Utilisateur non trouvé avec l'ID : " + id));

    utilisateur.setEmail(utilisateurDto.getEmail());
    utilisateur.setAge(utilisateurDto.getAge());
    utilisateur.setNomComplete(utilisateurDto.getNomComplete());
    utilisateur.setPoids(utilisateurDto.getPoids());
    utilisateur.setTaille(utilisateurDto.getTaille());
    utilisateur.setSexe(utilisateurDto.getSexe());
    utilisateur.setPassword(utilisateurDto.getPassword());

    Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
    return modelMapper.map(savedUtilisateur, UtilisateurDto.class);

}
public void deleteUtilisateur(Long id) {
            utilisateurRepository.deleteById(id);
}

}
