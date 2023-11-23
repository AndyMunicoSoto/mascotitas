package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.EspecialidadRepository;
import com.mascotitas.TF.entity.Especialidad;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EspecialidadService {

    private final EspecialidadRepository especialidadRepository;
    @Transactional
    public Especialidad createEspecialidad(Especialidad especialidad)
    {
        return especialidadRepository.save(especialidad);
    }
    @Transactional
    public List<Especialidad> getAllEspecialidad()
    {
        return especialidadRepository.findAll();
    }

    @Transactional
    public Especialidad updateEspecialidad( Long especialidadId, Especialidad especialidadResource)
    {
        Optional<Especialidad> optionalEspecialidad = especialidadRepository.findById(especialidadId);

        if (optionalEspecialidad.isPresent())
        {
            Especialidad especialidad = optionalEspecialidad.get();

            especialidad.setTitulo(especialidadResource.getTitulo());
            especialidad.setDescripcion((especialidadResource.getDescripcion()));
            especialidad.setVeterinarios(especialidadResource.getVeterinarios());

            especialidad = especialidadRepository.save(especialidad);
            return especialidad;
        }
        throw new ResourceNotFoundException("Especialidad not found  with id: " + especialidadId);


    }

    @Transactional
    public void deleteEspecialidad( Long especialdiadId)
    {
        if (!especialidadRepository.existsById(especialdiadId))
        {
            throw new ResourceNotFoundException("Especialidad not found with id: "+ especialdiadId);

        }

        especialidadRepository.deleteById(especialdiadId);

    }

}
