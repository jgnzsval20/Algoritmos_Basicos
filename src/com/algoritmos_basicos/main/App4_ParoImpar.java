package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App4_ParoImpar {

	public static void main(String[] args) {
		int iNum;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		iNum = entrada.nextInt();
		if (iNum%2==0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar");
		}
	}

}
