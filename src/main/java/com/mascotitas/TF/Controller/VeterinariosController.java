package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.VeterinariaService;
import com.mascotitas.TF.Service.VeterinariosService;
import com.mascotitas.TF.entity.Veterinarios;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarios")
@RequiredArgsConstructor
public class VeterinariosController {

    private final VeterinariosService veterinariosService;


    @PostMapping
    public ResponseEntity<Veterinarios> createVeterinario(@Valid @RequestBody Veterinarios veterinarioResource) {
        Veterinarios responseResource = veterinariosService.createVeterinario(veterinarioResource);
        return new ResponseEntity<>(responseResource, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Veterinarios>> getAllVeterianrios()
    {
        List<Veterinarios> veterinariosResponseResource = veterinariosService.getAllVeterinarios();
        return new ResponseEntity<>(veterinariosResponseResource, HttpStatus.OK);
    }

    @PutMapping("/{veterinarioId}")
    public ResponseEntity<Veterinarios> updateVeterinario(@PathVariable Long veterinarioId, @Valid @RequestBody Veterinarios veterinariosResource)
    {
        Veterinarios veterinariosResponseResouce = veterinariosService.updateVeterinarios(veterinarioId, veterinariosResource);
        return new ResponseEntity<>(veterinariosResponseResouce, HttpStatus.OK);
    }

}
