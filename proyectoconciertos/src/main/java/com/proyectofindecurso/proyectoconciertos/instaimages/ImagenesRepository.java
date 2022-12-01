package com.proyectofindecurso.proyectoconciertos.instaimages;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ImagenesRepository extends CrudRepository <Imagen, Integer> {
    List<Imagen> findAll();
    
}
