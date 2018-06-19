package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App22_Factorial {

	public static void main(String[] args) {
		int iNum; 
		double sum=1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número para calcular su factorial: ");
		iNum = entrada.nextInt();
		
		for(int i=1;i<=iNum;i+=1) {
			sum *= i;
		}
		System.out.println("El factorial es:");
		System.out.println(sum);

	}

}
