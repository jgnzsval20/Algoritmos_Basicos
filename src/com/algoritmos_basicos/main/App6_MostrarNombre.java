package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App6_MostrarNombre {

	public static void main(String[] args) {
		
		// Declaración de las variables
		String sNombre = "";
		int cont2=0;
		/*
		char caracter = ' ';
		double valor = 0.0;
		boolean isTrue=false;
		float valor2=0;*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame tu nombre: ");
		sNombre = entrada.nextLine();
		
		//----------CICLO FOR		
		for(int cont=0; cont<10;cont++) {
			System.out.println("Hola" + "  " + sNombre);
		}
		
		//---------- CICLO WHILE
		/*while(cont2<10) {
			System.out.println("Hola" + "  " + sNombre);
			cont2++;
		}
		
		//---------- CICLO DO-WHILE
		do 
		{
			System.out.println("Hola" + "  " + sNombre);
			cont2++;
		}while(cont2<10);*/
		
	}
		
}
