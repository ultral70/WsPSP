package entidades;

public class Habitacion {

	private double m2;
	private TipoHabitacion tipoHabitacion;
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public TipoHabitacion gettipoHabitacion() {
		return tipoHabitacion;
	}
	public void settipoHabitacion(TipoHabitacion tH) {
		this.tipoHabitacion = tH;
	}
	@Override
	public String toString() {
		return "Habitacion [m2=" + m2 + ", tipoHabitacion=" + tipoHabitacion + "]";
	}
	
	
	
}
