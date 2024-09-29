package com.centroinformacion.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editorial {

	private int idEditorial;
	private String razonSocial;
	private String direccion;
	private String ruc;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Lima")
	private Date fechaCreacion;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fechaRegistro;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fechaActualizacion;

	private int estado;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Pais pais;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Usuario usuarioRegistro;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Usuario usuarioActualiza;

}
