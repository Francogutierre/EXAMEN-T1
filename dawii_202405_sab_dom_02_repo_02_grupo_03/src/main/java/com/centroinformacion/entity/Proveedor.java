package com.centroinformacion.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Proveedor {

	private int idProveedor;
	private String razonsocial;
	private String ruc;
	private String direccion;
	private String celular;
	private String contacto;
	private int estado;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fechaRegistro;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fechaActualizacion;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Pais pais;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private DataCatalogo tipoProveedor;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Usuario usuarioRegistro;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Usuario usuarioActualiza;

}
