package com.centroinformacion.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PrestamoHasLibro {

	private PrestamoHasLibroPK prestamoHasLibroPK;
	private Prestamo prestamo;
	private Libro libro;

}
