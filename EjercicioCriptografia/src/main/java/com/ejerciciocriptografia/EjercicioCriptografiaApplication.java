package com.ejerciciocriptografia;

import javax.crypto.Cipher;

import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ejerciciocriptografia.modelo.entidad.Usuario;
import com.ejerciciocriptografia.modelo.persistencia.DaoUsuario;

@SpringBootApplication
public class EjercicioCriptografiaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioCriptografiaApplication.class, args);
	
//		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
//	
//		try {
//			
//			//Obtenemos el generador de claves 
//			//pasándole el algoritmo de encriptación
//			KeyGenerator gen = KeyGenerator.getInstance("AES");
//			
//			//Obtenemos la clave privada usando el generador
//			SecretKey clave = gen.generateKey();
//			
//			//Obtenemos el descifrador
//			Cipher descif = Cipher.getInstance("AES");
//			
//			//Configuramos el descifrador con la clave privada
//			descif.init(Cipher.ENCRYPT_MODE, clave);
//			
//			Usuario pipo = new Usuario("Pipo",
//					"123456");
//			
//			//Ciframos el objeto creado con el 
//			//descifrador ya configurado y el objeto
//			SealedObject so = new SealedObject(pipo, descif);
//			
//			UsuEncript usuEn = new UsuEncript(so.toString());
//			
//			du.save(usuEn);
//			
//		} catch (Exception e) {
//			
//			System.err.println("Error");
//			
//		}
		

		
	}

}
