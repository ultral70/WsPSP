package entidades;

public class Direccion {

	private String nombreVia;
	private TipoVia tV;
	private String cp;
	
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public TipoVia gettV() {
		return tV;
	}
	public void settV(TipoVia tV) {
		this.tV = tV;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	@Override
	public String toString() {
		return "Direccion [nombreVia=" + nombreVia + ", tV=" + tV + ", cp=" + cp + "]";
	}
	
	
	
}
