package com.centroinformacion.entity;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DevolucionHasLibro {

	private DevolucionHasLibroPK devolucionHasLibroPK;
	private Devolucion devolucion;
	private Libro libro;

	
	
}
