package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.MascotaService;
import com.mascotitas.TF.entity.Mascota;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
@RequiredArgsConstructor
public class MascotaController {

    private final MascotaService mascotaService;

    @PostMapping
    public ResponseEntity<Mascota> createMascota(@Valid @RequestBody Mascota mascota)
    {
        Mascota responseResource = mascotaService.createMascota(mascota);
        return new ResponseEntity<>(responseResource, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Mascota>> getAllMascota()
    {
        List<Mascota> mascotaResponseResource = mascotaService.getAllMascota();
        return new ResponseEntity<>(mascotaResponseResource, HttpStatus.OK);
    }

    @PutMapping("/{mascotaId}")
    public ResponseEntity<Mascota> updateMascota(@PathVariable Long mascotaId, @Valid @RequestBody Mascota mascotaResource)
    {
        Mascota mascotaResponseResource = mascotaService.updateMascota(mascotaId, mascotaResource);
        return new ResponseEntity<>(mascotaResponseResource, HttpStatus.OK);
    }

}
