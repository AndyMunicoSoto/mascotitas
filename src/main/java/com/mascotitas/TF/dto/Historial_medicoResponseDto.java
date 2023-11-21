package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Historial_medicoResponseDto {

    private Long Id;
    private CitasResponseDto citas;
    private MascotaResponseDto mascota;

}
