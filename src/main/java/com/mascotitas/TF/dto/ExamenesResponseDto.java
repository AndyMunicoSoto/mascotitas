package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamenesResponseDto {

    private Long Id;
    private String Exam_realizado;
    private String Resultado;

    private CitasResponseDto citas;


}
