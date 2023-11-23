package com.mascotitas.TF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    private String usuario;
    private String contrasenia;

}
