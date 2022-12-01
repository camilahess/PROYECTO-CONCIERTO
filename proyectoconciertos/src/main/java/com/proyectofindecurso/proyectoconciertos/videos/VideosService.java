package com.proyectofindecurso.proyectoconciertos.videos;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideosService {
    private final VideosRepository vRepository;

    public List<Video> getVideos() {
        return (List<Video>)vRepository.findAll();
    }

 

}
