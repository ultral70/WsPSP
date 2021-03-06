package com.ejerciciovideojuego.model.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //tabla con todos los campos obligatorios
public class Videojuego {

	@Id //primary key
	@GeneratedValue //valor autoincrementado
	private int id;
	@Column(unique = true) //valor único
	private String nombre;
	private String compani;
	private double precio;
	private double punto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompani() {
		return compani;
	}
	public void setCompani(String compani) {
		this.compani = compani;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPunto() {
		return punto;
	}
	public void setPunto(double punto) {
		this.punto = punto;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compani=" + compani + ", precio=" + precio
				+ ", punto=" + punto + "]";
	}
	
}
