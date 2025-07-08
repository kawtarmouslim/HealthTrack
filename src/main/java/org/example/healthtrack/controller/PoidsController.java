package org.example.healthtrack.controller;

import lombok.AllArgsConstructor;
import org.example.healthtrack.dto.PoidsDto;
import org.example.healthtrack.model.Poids;
import org.example.healthtrack.services.PoidsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/v1")
@RequestMapping
@AllArgsConstructor
public class PoidsController {
    private final PoidsService poidsService;
    @PostMapping("/addPoids")
    public PoidsDto createPoids( @RequestBody PoidsDto poidsDto) {
        PoidsDto poids = poidsService.create(poidsDto);
        return poids;
    }
    @PutMapping("/pids/{id}")
    public PoidsDto updatePoids(@PathVariable Long id,@RequestBody PoidsDto poidsDto) {
        return poidsService.update(id, poidsDto);
    }
    @GetMapping("/allPoids")
    public List<PoidsDto> getAllPoids() {
        return poidsService.GetAll();
    }

}
