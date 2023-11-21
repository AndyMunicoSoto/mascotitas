package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "especialidad")
public class Especialidad {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Titulo;
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "veterinarios_id")
    private Veterinarios veterinarios;

}
