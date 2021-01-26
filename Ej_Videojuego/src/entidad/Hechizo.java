package entidad;

import utils.Aleatorio;

public class Hechizo extends Arma{

	@Override
	public int usar() {		
		// TODO Auto-generated method stub
		int da�o = Aleatorio.calcularNumero(getDa�oMinimo(), getDa�oMaximo());
		int magiaCaos = Aleatorio.calcularNumero(1, 100);
		if(magiaCaos <= 25) {
			System.out.println("MAGIA DEL CAOS!!!!");
			da�o *= 2;//en caso de magia del caos, DOBLE DA�O
		}
		return da�o;
	}

}
