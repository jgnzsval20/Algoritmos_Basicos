package com.algoritmos_basicos.main;
import java.util.Scanner;
public class App2_AnioNacimiento {

	public static void main(String[] args) {
		int iEdad;
		int iAnioA = 2018;
		int iAnioN = 0;
		
		System.out.println("Ingresa tu año de Nacimiento: ");
		Scanner entrada = new Scanner(System.in);
		iAnioN = entrada.nextInt();
		iEdad = iAnioA - iAnioN;
		System.out.println("Tu edad para el 2018 será de:" +iEdad);

	}

}
