package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MascotaDto {

    private String Nombre;
    private int Edad;
    private String Raza;
    private String Especie;
    private Long duenioId;

}
