package com.ejercicio1.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio1.modelo.entidad.Videojuego;

@RestController
public class ControladorMensaje {

	@Autowired
	private Videojuego video;
	
	@GetMapping("dammiVideogioco")
	public Videojuego ottenereVideogioco() {

		video.setId(5);
		video.setNombre("La Vendetta");
		video.setCompañia("It Pictures");
		
		return video;
		
	}
	
	@PutMapping("aggiungi10")
	public String aggiungi10() {
		
		video.setPrecio(video.getPrecio() + 10);
		
		String ok = "OK";
		
		return ok;
		
	}
	
}
