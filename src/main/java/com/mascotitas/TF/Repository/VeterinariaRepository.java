package com.mascotitas.TF.Repository;

import com.mascotitas.TF.entity.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinariaRepository extends JpaRepository<Veterinaria,Long> {
}
