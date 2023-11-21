package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mascota")
public class Mascota {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private int Edad;
    private String Raza;
    private String Especie;

    @ManyToOne
    @JoinColumn(name = "duenio_id")
    private Duenio duenio;

}
