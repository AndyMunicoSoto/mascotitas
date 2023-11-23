package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.CitasRepository;
import com.mascotitas.TF.dto.CitasDto;
import com.mascotitas.TF.dto.CitasResponseDto;
import com.mascotitas.TF.entity.Citas;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CitasService {

    private final CitasRepository citasRepository;


    @Transactional
    public Citas createCita(Citas cita)
    {
        return citasRepository.save(cita);
    }

    @Transactional
    public List<Citas> getAllCitas()
    {
        return citasRepository.findAll();
    }


    @Transactional
    public Citas updateCitas( Long citasId, Citas citaResource )
    {
        Optional<Citas> optionalCitas = citasRepository.findById(citasId);

        if (optionalCitas.isPresent())
        {
            Citas citas = optionalCitas.get();

            citas.setFecha(citaResource.getFecha());
            citas.setHora(citaResource.getHora());
            citas.setConsulta(citaResource.getConsulta());
            citas.setVeterinaria(citaResource.getVeterinaria());

            citas = citasRepository.save(citas);
            return citas;
        }
        else
        {
            throw new ResourceNotFoundException("citas not found  with id: " + citasId);
        }
    }


    @Transactional
    public void deleteCita( Long citaId)
    {
        if(!citasRepository.existsById(citaId))
        {
            throw new ResourceNotFoundException("Cita not found with id: "+ citaId);
        }

        citasRepository.deleteById(citaId);

    }

}
