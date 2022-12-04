package com.proyectofindecurso.proyectoconciertos.instaimages;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImagenesService {
    private final ImagenesRepository iRepository;

    public List<Imagen> getImagenes() {
        return (List<Imagen>) iRepository.findAll();
    }
}
