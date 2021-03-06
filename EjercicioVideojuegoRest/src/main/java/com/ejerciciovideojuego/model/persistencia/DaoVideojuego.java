package com.ejerciciovideojuego.model.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciovideojuego.model.entidad.Videojuego;

//El integer es para indicar el tipo de clave primaria
//Y damos de alta el objeto en el contexto de spring con la etiqueta
@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{

	
	
}
