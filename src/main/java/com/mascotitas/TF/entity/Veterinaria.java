package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "veterinaria")
public class Veterinaria {

    @jakarta.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private String Direccion;
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "historial_medico_id")
    private Historial_medico historial_medico;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private Veterinarios veterinario;

}
