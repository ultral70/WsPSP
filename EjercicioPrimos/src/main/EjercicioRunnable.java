package main;

import java.util.Scanner;

import thread.EjercicioThread;

public class EjercicioRunnable {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int num = teclado.nextInt();
		
		System.out.println("Introduce un número entero");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce un número entero");
		int num3 = teclado.nextInt();
		
		EjercicioThread hilo1 = new EjercicioThread(num);
		EjercicioThread hilo2 = new EjercicioThread(num2);
		EjercicioThread hilo3 = new EjercicioThread(num3);
		
		Thread h1 = new Thread(hilo1, "Hilo 1");
		Thread h2 = new Thread(hilo2, "Hilo 2");
		Thread h3 = new Thread(hilo3, "Hilo 3");
		
		try {
			Thread.sleep(500);//5 seg
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		h1.start();
		h2.start();
		h3.start();
		
		teclado.close();
		
	}
	
}
