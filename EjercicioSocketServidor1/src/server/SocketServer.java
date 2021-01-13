package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("      APLICACIÓN DE SERVIDOR      ");
		System.out.println("----------------------------------");
		
		//Este objeto es el que abrirá un puerto
		//Este objeto se encargara de crear el objeto Socket cuando le llegue una petición
		ServerSocket servidorSocket = null;
		//El objeto Socket sera el tubo o carretera por el que circulara la información
		Socket socketConexion = null;
		//Tambiebn necesitamos de unos objetos que trabajen con la información de entrada y de salida
		PrintStream salida = null;
		InputStreamReader entrada = null;		
		
		try {
			servidorSocket = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(IP_SERVER,PUERTO);
			//decimos al socket que escuche peticiones desde la IP y el puerto
			servidorSocket.bind(direccion);
			
			//estamos continuamente escuchando 
			while(true){
				System.out.println("SERVIDOR: Esperando peticion...");
				//Cuando la conexion es establecida, se crea un socket en 
				//para llevar la comunicacion
				socketConexion = servidorSocket.accept();//Se parará el programa, hasta que entre la peticion de un cliente
													//Y se crear un objeto Socket
				entrada = new InputStreamReader(socketConexion.getInputStream());
				//este InputStreamReader permite leer caracter a caracter
				BufferedReader bf = new BufferedReader(entrada);
				//este BufferedReader permite leer frase a frase
				
				//El servidor se quedaría aquí parado hasta que el cliente escriba algo
				String stringRecibido = bf.readLine();//"3-4"
				//MUY IMPORTANTE, la informacion siempre llega en formato STRING
				//TODO LO QUE LLEGA DEL CLIENTE Y LO QUE LE MANDE AL SERVIDOR SON STRING
				System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);
				String[] operadores = stringRecibido.split("-");
				double iNumero1 = Double.parseDouble(operadores[0]);
				double iNumero2 = Double.parseDouble(operadores[1]);
				int codOper = Integer.parseInt(operadores[2]);//Código de la operación
				
				double resultado = 0;
				
				switch (codOper) {
				case 1:
					
					resultado = iNumero1 + iNumero2;
					
					break;

				case 2:
					
					resultado = iNumero1 - iNumero2;
					
					break;
					
				case 3:
					
					resultado = iNumero1 * iNumero2;
					
					break;
					
				case 4:
					
					resultado = iNumero1 / iNumero2;
					
					break;
					
				case 5:
					
					resultado = iNumero1 + iNumero2;
					
					break;

				}
				 
				//Thread.sleep(10000);//simulamos que tardamos un tiempo en calcular
				salida = new PrintStream(socketConexion.getOutputStream());
				salida.println(resultado);
				
			}
		} catch (IOException excepcion) {
			System.out.println(excepcion);
		}finally {//ES MUYYY IMPORTANTE QUE EN LOS SOCKETS SIEMPRE SE CIERREN LAS CONEXIONES
			try {
				if(salida != null && entrada != null){
					salida.close();
					entrada.close();
					socketConexion.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}

