package com.ejerciciocriptografia.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejerciciocriptografia.modelo.entidad.Usuario;
import com.ejerciciocriptografia.modelo.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {

	@Autowired
	GestorUsuario gestorUsuario;
	
	@PostMapping("inicioSes")
	public String inicioSes(
			@RequestParam("nom_usu") String nom,
			@RequestParam("cont") String cont,
			Model model) {
		
		Usuario usu = new Usuario();
		usu.setNom(nom);
		usu.setCont(cont);
		
		boolean validado = gestorUsuario.validarUsuario(usu);
		
		if (validado) {
			
			model.addAttribute("nom_usu", usu.getNom());
			
			return "Principal";			
			
		} else return "Error_general";
		
	}
	
	@PostMapping("registro")
	public String registro(
			@RequestParam("nom_usu") String nom,
			@RequestParam("cont") String cont,
			Model model) {
		
		Usuario usu = new Usuario();
		usu.setNom(nom);
		usu.setCont(cont);
		
		boolean validado = gestorUsuario.registrarUsuario(usu);
		
		if (validado) {
			
			model.addAttribute("nom_usu", usu.getNom());
			
			return "Principal";			
			
		} else return "Error_general";
		
	}
	
}
