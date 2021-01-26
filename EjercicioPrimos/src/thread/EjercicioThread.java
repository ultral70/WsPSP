package thread;

import java.util.Date;

public class EjercicioThread implements Runnable {

	public int num;
	
	
	
	public EjercicioThread(int num) {
		this.num = num;
	}


	/*
	 * El constructor
	 */

	@Override
	public void run() {
		
		Date date1 = new Date();
		
		long tiempo1 = date1.getTime();
		
        int contador = 0;
 
        for(int i = 1; i <= num; i++)
        {
            if((num % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        
        try {
			Thread.sleep(500 );//5 seg
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Date date2 = new Date();
        
        long tiempo2 = date2.getTime();
        
        long tiempoTotal = tiempo2 - tiempo1;
        
        System.out.println("Han pasado " + tiempoTotal + " milisegundos");
        
    }

}

