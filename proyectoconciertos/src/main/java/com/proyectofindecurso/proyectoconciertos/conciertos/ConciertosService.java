package com.proyectofindecurso.proyectoconciertos.conciertos;

import java.util.List;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConciertosService {
    private final ConciertosRepository conciertoRepository;
    private final JdbcAggregateTemplate jdbcTemplate;

    public List<Concierto> getAll() {
        return (List<Concierto>) conciertoRepository.findAll();
    }

    public Concierto insert(Concierto concierto) {
        return jdbcTemplate.insert(concierto);
    }

    public Concierto update(Concierto c, int id) {
        if (!conciertoRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Concierto no encontrado", null);
        }
        c.setId(id); // Al tener una id hace un update en lugar de un insert
        return conciertoRepository.save(c);
    }

    public void delete(int id) {
        conciertoRepository.deleteById(id);
    }
}