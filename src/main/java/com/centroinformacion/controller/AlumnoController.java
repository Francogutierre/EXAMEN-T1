package com.centroinformacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centroinformacion.entity.Alumno;
import com.centroinformacion.service.AlumnoService;

@RestController
@RequestMapping("/url/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/lista")
    public List<Alumno> getAllAlumnos() {
        return alumnoService.findAll();
    }

    @PostMapping("/inserta")
    public Alumno insertaAlumno(@RequestBody Alumno alumno) {
        return alumnoService.insertaAlumno(alumno);
    }
}
