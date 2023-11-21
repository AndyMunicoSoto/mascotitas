package com.mascotitas.TF.Repository;

import com.mascotitas.TF.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota,Long> {
}
