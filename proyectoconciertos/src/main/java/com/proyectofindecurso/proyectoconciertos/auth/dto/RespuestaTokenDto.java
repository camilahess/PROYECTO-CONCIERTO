package com.proyectofindecurso.proyectoconciertos.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class RespuestaTokenDto {
    private String accessToken;
}
