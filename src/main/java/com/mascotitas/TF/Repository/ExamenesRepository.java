package com.mascotitas.TF.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mascotitas.TF.entity.Examenes;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenesRepository extends JpaRepository<Examenes,Long> {
}
