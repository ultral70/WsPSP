package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/*
 * Socket designa un concepto abstracto por el cual dos procesos (posiblemente situados en computadoras distintas) 
 * pueden intercambiar cualquier flujo de datos, generalmente de manera fiable y ordenada.
 * 
 * Usa generalmente el protocolo TCP/IP
 */
public class SocketCliente {
	
	//IP y Puerto a la que nos vamos a conectar
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";
	
	public static void main(String[] args) {
		System.out.println("        APLICACIÓN CLIENTE");
		System.out.println("-----------------------------------");
		
		//Socket es la clase que nos va a permitir comunicarnos con el servidor
		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;

		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);

		Scanner sc = new Scanner(System.in);
		try {
			socketCliente = new Socket();
			socketCliente.connect(direccionServidor);
			System.out.println("Conexion establecida... a " + IP_SERVER + " por el puerto "
					+ PUERTO);
			
			entrada = new InputStreamReader(socketCliente.getInputStream());//entrada de datos del servidor (from)
			salida = new PrintStream(socketCliente.getOutputStream());//salida de datos al servidor(to)
			
			String numero1;
			String numero2;
			String codOper;
			String operandos;
			String seguir;
			
			//esta clase nos ayuda a leer datos del servidor linea a linea
			BufferedReader bf = new BufferedReader(entrada);
			String resultado;
			
			boolean continuar = true;
			boolean continuar2 = true;
			
			while (continuar) {
				
				System.out.println("CLIENTE: INICIO PROGRAMA CIFRAS");
				
				System.out.println("\nIntroduce el primer número");
				numero1 = sc.nextLine();//aqui se queda parada la app hasta que intro datos
				
				System.out.println("\nIntroduce el segundo número número");
				numero2 = sc.nextLine();
				
				System.out.println("\nIntroduce el código de operación");
				System.out.println("1 - SUMA");
				System.out.println("2 - RESTA");
				System.out.println("3 - MULTIPLICACIÓN");
				System.out.println("4 - DIVISIÓN");
				codOper = sc.nextLine();
				
				operandos = numero1 + "-" + numero2 + "-" + codOper;
				
				salida.println(operandos);
				
				//En la siguiente linea se va a quedar parado el hilo principal
				//de ejecución hasta que el servidor responda
				 resultado = bf.readLine();//Servidor envía operación resuelta
					
				System.out.println("CLIENTE: " + resultado);
				
				while (continuar2) {
					
					System.out.println("¿Desea introducir otra operación?");
					System.out.println("S/N");
					seguir = sc.nextLine();
					
					if (seguir.toUpperCase().equals("S")) {
						
						continuar = true;
						continuar2 = false;
						
					} else if (seguir.toUpperCase().equals("N")) {
						
						continuar = false;
						continuar2 = false;
						
					} else {
						
						continuar2 = true;
						
						System.out.println("Código no aceptado");
						
					}
					
				}
				
			}
			
			System.out.println("FIN DEL PROGRAMA");

		} catch (Exception e) {
			System.err.println("Error: " + e);
			e.printStackTrace();
		} finally {//ES MUYYY IMPORTANTE QUE EN LOS SOCKETS SIEMPRE SE CIERREN LAS CONEXIONES			
			try {
				salida.close();
				entrada.close();
				socketCliente.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
