package com.proyectofindecurso.proyectoconciertos.instaimages;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/instaimages")
@CrossOrigin(origins = "http://localhost:4200")
public class ImagenesController {
    private final ImagenesService iService;

    @GetMapping
    public List<Imagen> getImagenes() {
            return iService.getImagenes();
            }
        }

