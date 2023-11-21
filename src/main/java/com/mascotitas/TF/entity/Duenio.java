package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "duenio")
public class Duenio {

    @jakarta.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombres;
    private String Apellido;
    private int Edad;
    private String Direccion;
    private String Correo;
    private int Num_telefono;
    private int DNI;
    private int Cantidad_Mascota;

}
