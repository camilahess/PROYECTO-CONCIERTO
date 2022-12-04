package com.proyectofindecurso.proyectoconciertos.conciertos;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Concierto {
    @Id
    private int id;
    private String fecha;
    private String festival;
    private String ciudad;
    private String pais;
    private String link;
}
