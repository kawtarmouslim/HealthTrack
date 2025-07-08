package org.example.healthtrack.controller;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.UtilisateurDto;
import org.example.healthtrack.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class UtlisateurController {
    private  final UtilisateurService utilisateurService;

    @PostMapping("/addUtilisateur")
    public UtilisateurDto addUtilisateur(@RequestBody UtilisateurDto utilisateurDto) {
        return  utilisateurService.createUtilisateur(utilisateurDto);
    }
    @GetMapping("/{id}")
    public UtilisateurDto getUtilisateur(Long id) {
        return utilisateurService.getUtilisateurById(id);
    }
    @GetMapping
    public List<UtilisateurDto> getAllUtilisateurs() {
            return utilisateurService.getAllUtilisateurs();

    }
    @PutMapping("/{id}")
    public UtilisateurDto UpdateUtilisateur(@PathVariable Long id, @RequestBody UtilisateurDto utilisateurDto) {
        return utilisateurService.updateUtilisateur(id, utilisateurDto);
    }
    @DeleteMapping("/{id}")
    public void DeleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteUtilisateur(id);

    }

}
