package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeterinariaDto {

    private String Nombre;
    private String Direccion;
    private String Descripcion;

    private Long historial_medico_Id;

    private Long veterinariosId;

}
