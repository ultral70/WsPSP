package com.ejerciciocriptografia.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciocriptografia.modelo.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {
	
	public Usuario findByNomAndCont(String nom, String cont);
	
}
