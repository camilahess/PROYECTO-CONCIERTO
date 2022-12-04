package com.proyectofindecurso.proyectoconciertos.videos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    private int id;
    private String nombre;
    private String video;

}
