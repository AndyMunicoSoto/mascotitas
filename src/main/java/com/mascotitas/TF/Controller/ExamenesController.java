package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.ExamenesService;
import com.mascotitas.TF.entity.Examenes;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public ResponseEntity<List<Examenes>> getAllExamenes()
    {
        List<Examenes> examenesResponseResource = examenesService.getAllExamenes();
        return new ResponseEntity<>(examenesResponseResource, HttpStatus.OK);
    }
}
