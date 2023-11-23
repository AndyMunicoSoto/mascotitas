package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.MascotaRepository;
import com.mascotitas.TF.entity.Mascota;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    @Transactional
    public Mascota createMascota(Mascota mascota)
    {
        return mascotaRepository.save(mascota);
    }

    @Transactional
    public List<Mascota> getAllMascota()
    {
        return mascotaRepository.findAll();
    }

    @Transactional
    public Mascota updateMascota( Long mascotasId, Mascota mascotaResource )
    {
        Optional<Mascota> optionalMascota = mascotaRepository.findById(mascotasId);
        if (optionalMascota.isPresent())
        {
            Mascota mascota = optionalMascota.get();

            mascota.setNombre(mascotaResource.getNombre());
            mascota.setEdad(mascotaResource.getEdad());
            mascota.setRaza(mascotaResource.getRaza());
            mascota.setEspecie(mascotaResource.getEspecie());
            mascota.setDuenio(mascotaResource.getDuenio());

            mascota = mascotaRepository.save(mascota);
            return mascota;
        }
        else
        {
            throw new ResourceNotFoundException("Mascota not found  with id: " + mascotasId);

        }



    }

    @Transactional
    public void deleteMascota( Long mascotaId)
    {
        if(!mascotaRepository.existsById(mascotaId))
        {
            throw new ResourceNotFoundException("mascota not found with id: "+ mascotaId);
        }

        mascotaRepository.deleteById(mascotaId);

    }


}
