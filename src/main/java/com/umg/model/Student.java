package com.umg.model;


import java.util.Date;
import jakarta.persistence.*;
@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechacumple() {
		return fechacumple;
	}
	public void setFechacumple(Date fechacumple) {
		this.fechacumple = fechacumple;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String nombre;
	private String telefono;
	private Date fechacumple;
	private String departamento;
	public String getNombre() {
	return nombre;
	}
}


