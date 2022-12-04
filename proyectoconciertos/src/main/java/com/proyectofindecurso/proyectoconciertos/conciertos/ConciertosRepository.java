package com.proyectofindecurso.proyectoconciertos.conciertos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciertosRepository extends CrudRepository<Concierto, Integer> {

}
