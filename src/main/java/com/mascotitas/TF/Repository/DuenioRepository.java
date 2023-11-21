package com.mascotitas.TF.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mascotitas.TF.entity.Duenio;
import org.springframework.stereotype.Repository;

@Repository
public interface DuenioRepository extends JpaRepository<Duenio,Long> {
}
