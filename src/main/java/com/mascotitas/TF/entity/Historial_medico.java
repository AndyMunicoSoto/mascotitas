package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "historial_medico")
public class Historial_medico {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "citas_id")
    private Citas citas;

    @ManyToOne
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;

}
