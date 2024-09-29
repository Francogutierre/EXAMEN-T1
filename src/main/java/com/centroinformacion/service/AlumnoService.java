package com.centroinformacion.service;

import java.util.List;

import com.centroinformacion.entity.Alumno;

public interface AlumnoService {

    public List<Alumno> findAll();

    public Alumno insertaAlumno(Alumno alumno);
}
