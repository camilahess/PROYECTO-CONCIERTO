package com.proyectofindecurso.proyectoconciertos.usuarios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends CrudRepository <Usuario, Integer> {
    Optional<Usuario> findByCorreoAndPassword(String correo, String password);
}
