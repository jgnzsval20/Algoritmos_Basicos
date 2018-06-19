package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App19_TablaMultiplicar {

	public static void main(String[] args) {
		int iNum;
		int cont=1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
		iNum = entrada.nextInt();
		
		while(cont<=50){
			System.out.println(cont + " x " + iNum + " = " + cont*iNum);
			cont+=1;
		}
		
	}

}
