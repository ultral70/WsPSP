package entidad;

import utils.Aleatorio;

public class Arco extends Arma{

	@Override
	public int usar() {
		// TODO Auto-generated method stub
		int da�o = Aleatorio.calcularNumero(getDa�oMinimo(), getDa�oMaximo());
		return da�o;
	}

}
