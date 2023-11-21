package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.VeterinariaRepository;
import com.mascotitas.TF.entity.Veterinaria;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeterinariaService {

    private final VeterinariaRepository veterinariaRepository;

    @Transactional
    public Veterinaria createVeterinaria(Veterinaria vete)
    {
        return veterinariaRepository.save(vete);
    }
    public List<Veterinaria> getAllVeterinaria()
    {
        return veterinariaRepository.findAll();
    }

}
