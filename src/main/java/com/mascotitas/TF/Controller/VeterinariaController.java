package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.VeterinariaService;
import com.mascotitas.TF.entity.Veterinaria;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinaria")
@RequiredArgsConstructor
public class VeterinariaController {

    private final VeterinariaService veterinariaService;

    @PostMapping
    public ResponseEntity<Veterinaria> createVeterinaria(@Valid @RequestBody Veterinaria vete)
    {
        Veterinaria responseResource = veterinariaService.createVeterinaria(vete);
        return new ResponseEntity<>(responseResource, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Veterinaria>> getAllVeterinaria()
    {
        List<Veterinaria> veterinariaResponseResource = veterinariaService.getAllVeterinaria();
        return new ResponseEntity<>(veterinariaResponseResource, HttpStatus.OK);
    }

    @PutMapping("/{veterinariaId}")
    public ResponseEntity<Veterinaria> updateVeterinaria(@PathVariable Long veterinariaId, @Valid @RequestBody Veterinaria veterinariaResource)
    {
        Veterinaria veterinariaResponseResource = veterinariaService.updateV( veterinariaId,veterinariaResource);
        return  new ResponseEntity<>(veterinariaResponseResource, HttpStatus.OK);
    }


}
