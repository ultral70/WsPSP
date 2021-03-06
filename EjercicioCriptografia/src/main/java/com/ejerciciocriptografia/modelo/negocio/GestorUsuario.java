package com.ejerciciocriptografia.modelo.negocio;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciocriptografia.modelo.entidad.Usuario;
import com.ejerciciocriptografia.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;
	
	public boolean registrarUsuario(Usuario usu) {
		
		boolean validado = false;
		
		if(validarUsuario(usu)) {
			
			System.err.println("El usuario ya se "
					+ "encuentra registrado en la BBDD");
			
		} else {
			
			try {
				
				byte[] cont = usu.getCont().getBytes();
				
				MessageDigest md = MessageDigest.getInstance("SHA-512");
				
				md.update(cont);
				
				byte[] contSha = md.digest();
				
				String trueString = new String(contSha);
				
				Usuario usuarioAux = new Usuario(usu.getNom(), 
						trueString);
				
				daoUsuario.save(usuarioAux);
				
				validado = true;
				
			} catch (Exception e) {
				
				System.err.println("Algo ha fallado: " + e.getMessage());
				e.printStackTrace();
				
			}
			
		}
		
		return validado;
	}
	
	public boolean validarUsuario(Usuario usu) {
		
		boolean seguir = false;
		
		try {
			
			byte[] cont = usu.getCont().getBytes();
			
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			
			md.update(cont);
			
			cont = md.digest();
			
			String trueString = new String(cont);
			
			Usuario usuAux = daoUsuario.findByNomAndCont(usu.getNom(), trueString);
			
			if (usuAux != null) {
				
				seguir = true;
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return seguir;
		
	}
	
}
