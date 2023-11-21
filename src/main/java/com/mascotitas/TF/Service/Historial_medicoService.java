package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.ExamenesRepository;
import com.mascotitas.TF.Repository.Historial_medicoRepository;
import com.mascotitas.TF.entity.Examenes;
import com.mascotitas.TF.entity.Historial_medico;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Historial_medicoService {

    private final Historial_medicoRepository historialMedicoRepository;

    @Transactional
    public Historial_medico createHistorial( Historial_medico hm)
    {
        return historialMedicoRepository.save(hm);
    }
    @Transactional
    public List<Historial_medico> getAllhistorial_medico()
    {
        return historialMedicoRepository.findAll();
    }

    @Transactional
    public Historial_medico updateHM( Long hmId, Historial_medico hmResource)
    {
        Optional<Historial_medico> optionalHistorialMedico = historialMedicoRepository.findById(hmId);

        if (optionalHistorialMedico.isPresent())
        {
            Historial_medico hm = optionalHistorialMedico.get();

            hm.setCitas(hmResource.getCitas());
            hm.setMascota(hmResource.getMascota());

            hm = historialMedicoRepository.save(hm);

            return hm;

        }
        else
        {
            throw new ResourceNotFoundException("historial medico not found  with id: " + hmId);

        }
    }

}
