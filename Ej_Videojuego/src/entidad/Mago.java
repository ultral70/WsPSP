package entidad;

public class Mago extends Personaje{

	private int inteligencia;
	
	@Override
	public void atacar(Personaje p) {
		System.out.println("ALACAZAM!");		
		int da�o = getArma().usar();
		if(getArma() instanceof Hechizo) {
			da�o += inteligencia;
		}
		p.setPuntosVida(p.getPuntosVida() - da�o);
		System.out.println(this.getNombre() + 
				" Hace un da�o de: " + da�o);
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	
	
}
