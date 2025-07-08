package org.example.healthtrack.controller;

import lombok.RequiredArgsConstructor;
import org.example.healthtrack.dto.ActivitePhysiqueDto;
import org.example.healthtrack.services.ActivitePhysiqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ActivitePhysiqueController {
    private final ActivitePhysiqueService activitePhysiqueService;
    @GetMapping("/all")
    public List<ActivitePhysiqueDto> getActivitePhysique() {
        return activitePhysiqueService.getAllActivitePhysiqueDto();
    }
    @PostMapping("/add")
    public ActivitePhysiqueDto addActivitePhysique(@RequestBody ActivitePhysiqueDto activitePhysiqueDto) {
        return activitePhysiqueService.createActivitePhysiqueDto(activitePhysiqueDto);
    }
    @PutMapping("/update/{id}")
    public ActivitePhysiqueDto activitePhysiqueDto(@PathVariable Long id, @RequestBody ActivitePhysiqueDto dto) {
        return activitePhysiqueService.update(id,dto);
    }
    @DeleteMapping("/delete/{id}")
    public void activitePhysiqueDto(@PathVariable Long id) {
        activitePhysiqueService.delete(id);
    }
}
