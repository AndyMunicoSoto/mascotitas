package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.ExamenesService;
import com.mascotitas.TF.entity.Examenes;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examenes")
@RequiredArgsConstructor
public class ExamenesController {
    private final ExamenesService examenesService;

    @PostMapping
    public ResponseEntity<Examenes> createExamenes(@Valid @RequestBody Examenes examenes)
    {
        Examenes responseResource = examenesService.createExamenes(examenes);
        return  new ResponseEntity<>(responseResource,HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<Examenes>> getAllExamenes()
    {
        List<Examenes> examenesResponseResource = examenesService.getAllExamenes();
        return new ResponseEntity<>(examenesResponseResource, HttpStatus.OK);
    }

    @PutMapping("/{examenId}")
    public ResponseEntity<Examenes> updateExamen( @PathVariable Long examenId, @Valid @RequestBody Examenes examenResource)
    {
        Examenes examen = examenesService.updateExamenes( examenId, examenResource);
        return new ResponseEntity<>(examen, HttpStatus.OK);
    }

}
