package com.proyectofindecurso.proyectoconciertos.instaimages;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("instaimages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Imagen {
    @Id
    private int id;
    private String imagenes;

}
