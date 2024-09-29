package com.centroinformacion.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class PrestamoHasLibroPK implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idPrestamo;
	private int idLibro;

}
