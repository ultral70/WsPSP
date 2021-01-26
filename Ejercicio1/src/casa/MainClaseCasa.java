package casa;

import java.util.ArrayList;

import entidades.Casa;
import entidades.Direccion;
import entidades.Habitacion;
import entidades.Persona;
import entidades.TipoHabitacion;
import entidades.TipoVia;

public class MainClaseCasa {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		Persona persona = new Persona();
		
		persona.setNombre("Juan Carlos");
		persona.setDni("987654321I");
		persona.setEdad(40);
		casa.setPersona(persona);
		
		double precio;
		
		precio = 120000.0;
		
		casa.setPrecio(precio);
		
		Direccion direccion = new Direccion();
		
		direccion.setCp("29765");
		direccion.setNombreVia("Rey Misterio");
		direccion.settV(TipoVia.Calle);
		
		casa.setDireccion(direccion);
		
		ArrayList<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
		
		Habitacion baño = new Habitacion();
		baño.setM2(210.0);
		baño.settipoHabitacion(TipoHabitacion.Baño);
		
		Habitacion dormitorio = new Habitacion();
		dormitorio.setM2(60.0);
		dormitorio.settipoHabitacion(TipoHabitacion.Dormitorio);
		
		Habitacion salon = new Habitacion();
		salon.setM2(100.0);
		salon.settipoHabitacion(TipoHabitacion.Salón);
		
		listaHabitacion.add(salon);
		listaHabitacion.add(baño);
		listaHabitacion.add(dormitorio);
		
		casa.setListaHabitaciones(listaHabitacion);
		
		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		
		Persona inquilino1 = new Persona();		
		inquilino1.setDni("954278109Z");
		inquilino1.setEdad(76);
		inquilino1.setNombre("Paco");
		
		Persona inquilino2 = new Persona();		
		inquilino2.setDni("664388109Z");
		inquilino2.setEdad(46);
		inquilino2.setNombre("Salomón");
		
		listaInquilinos.add(inquilino1);
		listaInquilinos.add(inquilino2);
		 
		casa.setListaInquilinos(listaInquilinos);
		
		 System.out.println(casa);
		 
		 casa.calcM2();
		 
		 System.out.println(casa.calcM2True());
		 
		 
		 
	}
	
}
