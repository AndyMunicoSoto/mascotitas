package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.VeterinariaRepository;
import com.mascotitas.TF.entity.Veterinaria;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VeterinariaService {

    private final VeterinariaRepository veterinariaRepository;

    @Transactional
    public Veterinaria createVeterinaria(Veterinaria vete) {
        return veterinariaRepository.save(vete);
    }

    @Transactional
    public List<Veterinaria> getAllVeterinaria() {
        return veterinariaRepository.findAll();
    }

    @Transactional
    public Veterinaria update( Long veterinariaId, Veterinaria veteResource)
    {
        Optional<Veterinaria> optionalVeterinaria = veterinariaRepository.findById(veterinariaId);
        if (optionalVeterinaria.isPresent())
        {
            Veterinaria veterinaria = optionalVeterinaria.get();

            veterinaria.setNombre(veteResource.getNombre());
            veterinaria.setDescripcion(veteResource.getDescripcion());
            veterinaria.setDireccion(veteResource.getDireccion());
            veterinaria.setHistorial_medico(veteResource.getHistorial_medico());
            veterinaria.setVeterinario(veteResource.getVeterinario());

            veterinaria = veterinariaRepository.save(veterinaria);
            return veterinaria;

        }

        throw new ResourceNotFoundException("Veterinaria not found  with id: " + veterinariaId);

    }

}
