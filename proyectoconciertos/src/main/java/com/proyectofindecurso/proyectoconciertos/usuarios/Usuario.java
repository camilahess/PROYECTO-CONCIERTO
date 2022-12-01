package com.proyectofindecurso.proyectoconciertos.usuarios;

import org.springframework.data.annotation.Id;

import com.proyectofindecurso.proyectoconciertos.usuarios.dto.UsuarioInsertDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    @Id
    private int id;
    private String correo;
    private String password;
    
    public Usuario(UsuarioInsertDto dto) {
        this.correo = dto.getCorreo();
        this.password = dto.getPassword();
    }
}
