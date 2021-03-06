package com.ejerciciovideojuego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ejerciciovideojuego.controlador.Controlador;
import com.ejerciciovideojuego.model.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjercicioVideojuegoRestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioVideojuegoRestApplication.class, args);
	
	DaoVideojuego daoJuego = context.getBean("daoJuego", DaoVideojuego.class);
	
	Controlador control = new Controlador();
	
	daoJuego.save(control.obtenVideos());
	
	
	}

}
