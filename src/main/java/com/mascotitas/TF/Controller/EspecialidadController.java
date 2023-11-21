package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.EspecialidadService;
import com.mascotitas.TF.entity.Especialidad;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
@RequiredArgsConstructor
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    @PostMapping
    public ResponseEntity<Especialidad> createEspecialidad(@Valid @RequestBody Especialidad especialidad)
    {
        Especialidad responseResource = especialidadService.createEspecialidad(especialidad);
        return  new ResponseEntity<>(responseResource, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Especialidad>> getAllEspecialidad()
    {
        List<Especialidad> especialidadResponseResource = especialidadService.getAllEspecialidad();
        return new ResponseEntity<>(especialidadResponseResource, HttpStatus.OK);
    }

}
