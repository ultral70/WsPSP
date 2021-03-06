package com.ejerciciocriptografia.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 6491283387819090734L;

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String cont;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nom, String cont) {
		super();
		this.nom = nom;
		this.cont = cont;
	}
	
	
	
}
