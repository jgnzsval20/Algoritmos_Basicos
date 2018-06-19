package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App12_NumerosParPrimo {

	public static void main(String[] args) {
		int iNum;
		boolean isPrimo = true;
		char respuesta='s';
		String cadena;
		
		Scanner entrada = new Scanner(System.in);
		
		while(respuesta=='s' || respuesta=='S') {
			System.out.println("Introduce un número:");
			iNum = entrada.nextInt();
			if(iNum%2==0) {
				System.out.println("El número es Par");
			}
			else {
				System.out.println("El número es Impar");
			}
			for(int cont=2; cont<iNum;cont++) 
			{
				if(iNum%cont==0)
				{
					isPrimo=false;
				}
			}
			System.out.println("El numero introducido es primo? \n"+isPrimo);
			System.out.println("Desea introducir otro numero? \n");
			cadena=entrada.next();
			respuesta=cadena.charAt(0);
		}

	}
}
