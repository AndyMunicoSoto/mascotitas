package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.CitasService;

import com.mascotitas.TF.entity.Citas;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
@RequiredArgsConstructor
public class CitasController {

    private final CitasService citasService;

    @PostMapping
    public ResponseEntity<Citas> createCitas(@Valid @RequestBody Citas cita)
    {
        Citas responseResource = citasService.createCita(cita);
        return new ResponseEntity<>(responseResource, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Citas>> getAllCitas()
    {
        List<Citas> citasResponseResource = citasService.getAllCitas();
        return new ResponseEntity<>(citasResponseResource, HttpStatus.OK);
    }

    @PutMapping("/{citaId}")
    public ResponseEntity<Citas> updateCitas(@PathVariable Long citaId, @Valid @RequestBody Citas citasResource)
    {
        Citas citasResponseResource = citasService.updateCitas( citaId, citasResource );
        return new ResponseEntity<>(citasResponseResource, HttpStatus.OK);

    }


}
