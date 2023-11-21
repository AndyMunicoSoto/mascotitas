package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DuenioResponseDto {

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
