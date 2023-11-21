package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.VeterinariosRepository;
import com.mascotitas.TF.entity.Citas;
import com.mascotitas.TF.entity.Veterinarios;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VeterinariosService {

    private final VeterinariosRepository veterinariosRepository;

    @Transactional
    public Veterinarios createVeterinario(Veterinarios veterinarios)
    {
        return veterinariosRepository.save(veterinarios);
    }
    @Transactional
    public List<Veterinarios> getAllVeterinarios()
    {
        return veterinariosRepository.findAll();
    }

    @Transactional
    public Veterinarios updateVeterinarios( Long veterinariosId, Veterinarios veterinariosResource )
    {
        Optional<Veterinarios>  optionalVeterinarios = veterinariosRepository.findById(veterinariosId);
        if (optionalVeterinarios.isPresent())
        {
            Veterinarios veterinarios = optionalVeterinarios.get();

            veterinarios.setNombre(veterinariosResource.getNombre());
            veterinarios.setApellido(veterinariosResource.getApellido());

            veterinarios = veterinariosRepository.save(veterinarios);
            return veterinarios;
        }
        throw new ResourceNotFoundException("Veterinario not found  with id: " + veterinariosId);

    }

}
