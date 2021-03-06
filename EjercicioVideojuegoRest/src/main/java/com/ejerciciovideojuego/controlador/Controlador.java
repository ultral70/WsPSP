package com.ejerciciovideojuego.controlador;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejerciciovideojuego.model.entidad.Videojuego;

@RestController
public class Controlador {

	@Autowired
	private Videojuego juego;
	
	@GetMapping("Juegos")
	public Videojuego obtenVideos() {
		
		juego.setNombre("La Venganza de Don Mendo");
		juego.setCompani("Mendo S.L.");
		juego.setPrecio(69.9);
		juego.setPunto(5.6);
		
		return juego;
		
	}
	
	@PutMapping("masPrecio")
	public String masPrecio() {
		
		juego.setPrecio(juego.getPrecio() + 10);
		
		String ok = "OK";
		
		return ok;
		
	}
	
}
