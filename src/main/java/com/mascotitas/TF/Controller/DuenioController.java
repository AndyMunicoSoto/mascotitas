package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.DuenioService;
import com.mascotitas.TF.entity.Duenio;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenio")
@RequiredArgsConstructor
public class DuenioController {

    private final DuenioService duenioService;

    @PostMapping
    public ResponseEntity<Duenio> createDuenio(@Valid @RequestBody Duenio duenio)
    {
        Duenio responseResorce = duenioService.createDuenio(duenio);
        return new ResponseEntity<>(responseResorce, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Duenio>> getAllDuenio()
    {
        List<Duenio> duenioResponseResource = duenioService.getAllDuenio();
        return  new ResponseEntity<>(duenioResponseResource, HttpStatus.OK);
    }

    @PutMapping("/{duenioId}")
    public ResponseEntity<Duenio> updateDuenio( @PathVariable Long duenioId, @Valid @RequestBody Duenio duenioResource )
    {
        Duenio duenioResponseResource = duenioService.updateDuenio(duenioId, duenioResource);
        return new ResponseEntity<>(duenioResponseResource, HttpStatus.OK);
    }

}
