package com.algoritmos_basicos.main;
import java.util.Scanner;
public class App21_PascalFalso {

	public static void main(String[] args) {
		int iNum;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos escalones quieres? ");
		iNum = entrada.nextInt();
		
		for(int i=1;i<=iNum;i+=1) {
			for(int j=1; j<=i; j+=1) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}

}
