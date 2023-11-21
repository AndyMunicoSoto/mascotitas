package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "citas")
public class Citas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Fecha;
    private String Hora;
    private String Consulta;

    @ManyToOne
    @JoinColumn( name = "veterinaria_id")
    private Veterinaria veterinaria;
}
