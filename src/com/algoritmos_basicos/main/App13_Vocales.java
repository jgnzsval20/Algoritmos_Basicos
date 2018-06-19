package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App13_Vocales {

	public static void main(String[] args) {
		int iSize;
		int contA = 0;
		int contE = 0;
		int contI = 0;
		int contO = 0;
		int contU = 0;
		char iLetra;
		String cadena;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		cadena = entrada.nextLine();
		iSize=cadena.length();
		System.out.println("Tamaño de la palabra:"+iSize);
		for(int i=1;i<=iSize;i++) {
			iLetra=cadena.charAt(i-1);
			switch(iLetra) {
			case 'A': 
			case 'a': contA+=1;
			break;
			case 'E': 
			case 'e': contE+=1;
			break;
			case 'I': 
			case 'i': contI+=1;
			break;
			case 'O': 
			case 'o': contO+=1;
			break;
			case 'U': 
			case 'u': contU+=1;
			break;
			}
		}
		
		System.out.println("Contador A = "+contA);
		System.out.println("Contador E = "+contE);
		System.out.println("Contador I = "+contI);
		System.out.println("Contador O = "+contO);
		System.out.println("Contador U = "+contU);
	}

}
