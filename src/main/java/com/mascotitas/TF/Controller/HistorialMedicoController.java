package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.Historial_medicoService;
import com.mascotitas.TF.entity.Historial_medico;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historialMedico")
@RequiredArgsConstructor
public class HistorialMedicoController {

    private final Historial_medicoService historialMedicoService;


    @PostMapping
    public ResponseEntity<Historial_medico> createHM(@Valid @RequestBody Historial_medico hm)
    {
        Historial_medico responseResource = historialMedicoService.createHistorial(hm);
        return new ResponseEntity<>(responseResource, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Historial_medico>> getAllHistorialMedico()
    {
        List<Historial_medico> historialMedicosResponseResource = historialMedicoService.getAllhistorial_medico();
        return new ResponseEntity<>(historialMedicosResponseResource, HttpStatus.OK);
    }

}
