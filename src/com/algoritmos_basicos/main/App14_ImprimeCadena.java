package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App14_ImprimeCadena {

	public static void main(String[] args) {
		String cadena;
		int iNum;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		cadena = entrada.nextLine();
		System.out.println("Cuantas veces quieres que se repita:");
		iNum = entrada.nextInt();
		
		for(int i=1; i<=iNum; i+=1) {
			System.out.println(cadena);
		}

	}

}
