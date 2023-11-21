package com.mascotitas.TF.Repository;

import com.mascotitas.TF.entity.Veterinarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinariosRepository extends JpaRepository<Veterinarios,Long> {
}
