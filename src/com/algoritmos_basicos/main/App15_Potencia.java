package com.algoritmos_basicos.main;
import java.util.Scanner;
public class App15_Potencia {

	public static void main(String[] args) {
		int iBase;
		int iExp;
		double iRes;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la base");
		iBase = entrada.nextInt();
		System.out.println("Introduce el exponente");
		iExp = entrada.nextInt();
		iRes = Math.pow(iBase,iExp);
		System.out.println("El resultado es: "+iRes);
	}

}
