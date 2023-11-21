package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.VeterinariosRepository;
import com.mascotitas.TF.entity.Citas;
import com.mascotitas.TF.entity.Veterinarios;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeterinariosService {

    private final VeterinariosRepository veterinariosRepository;

    @Transactional
    public Veterinarios createVeterinario(Veterinarios veterinarios)
    {
        return veterinariosRepository.save(veterinarios);
    }
    public List<Veterinarios> getAllVeterinarios()
    {
        return veterinariosRepository.findAll();
    }

}
