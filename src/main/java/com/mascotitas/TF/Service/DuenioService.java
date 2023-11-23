package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.DuenioRepository;
import com.mascotitas.TF.entity.Citas;
import com.mascotitas.TF.entity.Duenio;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class DuenioService {

    private final DuenioRepository duenioRepository;

    public Duenio createDuenio(Duenio duenio)
    {
        return duenioRepository.save(duenio);
    }
    public List<Duenio> getAllDuenio() {
        List<Duenio> duenios = duenioRepository.findAll();
        return duenios;
    }

    @Transactional
    public Duenio updateDuenio( Long duenioId, Duenio duenioResource)
    {
        Optional<Duenio> optionalDuenio = duenioRepository.findById(duenioId);

        if (optionalDuenio.isPresent())
        {

            Duenio duenio = optionalDuenio.get();

            duenio.setNombres(duenio.getNombres());
            duenio.setApellido(duenioResource.getApellido());
            duenio.setEdad(duenioResource.getEdad());
            duenio.setDireccion(duenioResource.getDireccion());
            duenio.setCorreo(duenioResource.getCorreo());
            duenio.setNum_telefono((duenioResource.getNum_telefono()));
            duenio.setDNI(duenioResource.getDNI());
            duenio.setCantidad_Mascota(duenioResource.getCantidad_Mascota());

            duenio = duenioRepository.save(duenio);
            return duenio;

        }else
        {
            throw new ResourceNotFoundException("duenio not found  with id: " + duenioId);

        }
    }

    @Transactional
    public void deleteDuenio( Long duenioId)
    {
        if (!duenioRepository.existsById(duenioId))
        {
            throw new ResourceNotFoundException("Duenio not found with id: "+ duenioId);
        }

        duenioRepository.deleteById(duenioId);

    }


}
