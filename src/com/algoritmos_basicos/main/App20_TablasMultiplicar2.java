package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App20_TablasMultiplicar2 {

	public static void main(String[] args) {
		int iNum1;
		int iNum2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce hasta que número quieres: ");
		iNum1 = entrada.nextInt();
		System.out.println("Introduce cuantas tablas: ");
		iNum2 = entrada.nextInt();
		
		for(int i=1;i<=iNum1;i+=1) {
			for(int j=1; j<=iNum2;j+=1) {
				System.out.println( j + " x " + i + " = " + i*j);
			}
			System.out.println(" ");
		}

	}

}
