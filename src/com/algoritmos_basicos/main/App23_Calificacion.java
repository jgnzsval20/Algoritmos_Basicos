package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App23_Calificacion {

	public static void main(String[] args) 
	{
		char iCal=' ';
		char respuesta='s';
		String cadena;
		Scanner entrada = new Scanner(System.in);
		
		do 
		{
			System.out.println("Introduce tu Calificación: ");
			cadena=entrada.next();
			iCal=cadena.charAt(0);
			
			switch(iCal)
			{
			case 'A': 
			case 'a': System.out.println("Tienes 10");
			break;
			case 'B': 
			case 'b': System.out.println("Tienes 9");
			break;
			case 'C': 
			case 'c': System.out.println("Tienes 8");
			break;
			case 'D': 
			case 'd': System.out.println("Tienes 7");
			break;
			case 'E': 
			case 'e': System.out.println("Tienes 6");
			break;
			case 'F': 
			case 'f': System.out.println("Tienes 5");
			break;		
			default: System.out.println("Calificación no válida");
			}
			System.out.println("Deseas introducir otra Calificación?");
			cadena=entrada.next();
			respuesta=cadena.charAt(0);
		}while(respuesta=='s' || respuesta=='S');
	}
}
