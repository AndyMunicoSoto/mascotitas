package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "examenes")
public class Examenes {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Exam_realizado;
    private String Resultado;

    @ManyToOne
    @JoinColumn(name = "citas_id")
    private Citas citas;


}
