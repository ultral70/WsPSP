package entidades;

import java.util.ArrayList;

public class Casa {

	private Persona persona;
	private Direccion direccion;
	private Habitacion habitacion;
	private double precio;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	private ArrayList<Persona> listaInquilinos;
	private ArrayList<Habitacion> listaHabitaciones;
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public ArrayList<Persona> getListaInquilinos() {
		return listaInquilinos;
	}
	public void setListaInquilinos(ArrayList<Persona> listaInquilinos) {
		this.listaInquilinos = listaInquilinos;
	}
	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	@Override
	public String toString() {
		return "Casa [propietario=" + persona + ", direccion=" + direccion 
				+ ", listaInquilinos=" + listaInquilinos + ", listaHabitaciones=" 
				+ listaHabitaciones + "]";
	}
	
	public void calcM2() {
		
		double m2 = 0;
		Habitacion habitacion2 = new Habitacion();
		
		for (int i = 0; i < listaHabitaciones.size(); i++) {
			
			habitacion2 = listaHabitaciones.get(i);
			
			m2 = habitacion2.getM2() + m2;
			
		}
		
		System.out.println("La casa tiene " + m2 + " metros cuadrados");
		
	}
	
	public double calcM2True() {
		
		int m2totales = 0;
		
		for (Habitacion h : listaHabitaciones) {
			
			m2totales += h.getM2();
			
		}
		
		return m2totales;
		
	}
	
}
