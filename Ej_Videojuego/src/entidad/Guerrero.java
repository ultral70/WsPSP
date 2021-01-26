package entidad;

public class Guerrero extends Personaje{
	private int fuerza;

	@Override
	public void atacar(Personaje p) {
		System.out.println("ARGG");
		int da�o = getArma().usar();
		if(getArma() instanceof Espada || getArma() instanceof Arco) {
			da�o += fuerza;
		}
		
		p.setPuntosVida(p.getPuntosVida() - da�o);
		System.out.println(this.getNombre() + 
				" Hace un da�o de: " + da�o);
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
}
