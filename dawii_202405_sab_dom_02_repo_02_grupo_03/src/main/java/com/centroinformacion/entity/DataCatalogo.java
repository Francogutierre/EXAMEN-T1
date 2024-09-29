package com.centroinformacion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataCatalogo {
	
	private int idDataCatalogo;
	private String descripcion;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Catalogo catalogo;
	
}
