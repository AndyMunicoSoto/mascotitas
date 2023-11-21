package com.mascotitas.TF.Repository;

import com.mascotitas.TF.entity.Historial_medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Historial_medicoRepository extends JpaRepository<Historial_medico,Long> {
}
