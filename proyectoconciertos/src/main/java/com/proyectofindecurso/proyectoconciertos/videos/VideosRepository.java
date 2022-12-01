package com.proyectofindecurso.proyectoconciertos.videos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideosRepository extends CrudRepository<Video, Integer> {
    List<Video> findAll();
}
