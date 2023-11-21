package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspecialidadDto {

    private String Titulo;
    private String Descripcion;
    private Long veterinariosId;

}
