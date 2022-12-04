package com.proyectofindecurso.proyectoconciertos.conciertos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/conciertos")
@CrossOrigin(origins = "http://localhost:4200") // agregamos crossorigin para acceder desde el front

public class ConciertosController {
    private final ConciertosService conciertoService;

    @GetMapping
    public List<Concierto> getAll() {
        return conciertoService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Concierto insert(@RequestBody Concierto concierto) {
        return conciertoService.insert(concierto);
    }

    @PutMapping("/{id}")
    public Concierto update(@RequestBody Concierto c, @PathVariable int id) {
        return conciertoService.update(c, id);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        conciertoService.delete(id);
    }

}
