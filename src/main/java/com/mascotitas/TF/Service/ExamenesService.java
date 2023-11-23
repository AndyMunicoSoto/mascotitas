package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.ExamenesRepository;
import com.mascotitas.TF.entity.Duenio;
import com.mascotitas.TF.entity.Examenes;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamenesService {

    private final ExamenesRepository examenesRepository;

    @Transactional
    public Examenes createExamenes( Examenes examenes)
    {
        return examenesRepository.save(examenes);
    }

    @Transactional
    public List<Examenes> getAllExamenes()
    {
        return examenesRepository.findAll();
    }

    @Transactional
    public Examenes updateExamenes( Long examenesId, Examenes examenesResource)
    {
        Optional<Examenes> optionalExamenes = examenesRepository.findById(examenesId);

        if (optionalExamenes.isPresent())
        {
            Examenes  examenes = optionalExamenes.get();

            examenes.setExam_realizado(examenesResource.getExam_realizado());
            examenes.setResultado(examenesResource.getResultado());
            examenes.setCitas(examenesResource.getCitas());

            examenes = examenesRepository.save(examenes);
            return examenes;
        }
        else
        {
            throw new ResourceNotFoundException("examenes not found  with id: " + examenesId);
        }



    }

    @Transactional
    public void deleteExamen( Long examenId)
    {
        if (!examenesRepository.existsById(examenId))
        {
            throw new ResourceNotFoundException("Examen not found with id: "+ examenId);

        }

        examenesRepository.deleteById(examenId);
    }

}
