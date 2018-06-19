package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App3_AreaTriangulo {

	public static void main(String[] args) {
		
		int iBase;
		int iAltura;
		int iArea = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos a calcular el area de un Triángulo");
		System.out.println("Cual es la base:");
		iBase = entrada.nextInt();
		System.out.println("Cual es la altura:");
		iAltura = entrada.nextInt();
		iArea = (iBase*iAltura)/2;
		System.out.println("El Area es:"+iArea);
	}

}
