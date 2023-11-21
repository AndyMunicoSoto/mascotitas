package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeterinariaResponseDto {

    private Long Id;
    private String Nombre;
    private String Direccion;
    private String Descripcion;

    private Historial_medicoResponseDto historial_medico;

    private VeterinariosResponseDto veterinario;

}
