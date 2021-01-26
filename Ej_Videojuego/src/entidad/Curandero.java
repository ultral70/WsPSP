package entidad;

public class Curandero extends Personaje{
	private int sabiduria;
	
	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		System.out.println("AVE MARIA PURISIMA!");
		int da�o = getArma().usar();
		if(getArma() instanceof Rezo){
			da�o += sabiduria;
		}
		p.setPuntosVida(p.getPuntosVida() - da�o);
		System.out.println(this.getNombre() + 
				" Hace un da�o de: " + da�o);
	}
	
	
	

}
