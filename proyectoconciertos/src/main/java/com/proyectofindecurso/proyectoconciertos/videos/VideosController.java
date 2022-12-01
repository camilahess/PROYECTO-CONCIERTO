package com.proyectofindecurso.proyectoconciertos.videos;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/videos")
@CrossOrigin(origins = "http://localhost:4200")
public class VideosController {

    private final VideosService vService;

    @GetMapping
    public List<Video> getVideos() {
            return vService.getVideos();
            }
        }
