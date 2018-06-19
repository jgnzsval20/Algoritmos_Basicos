package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App1_Suma2Numeros 
{

	public static void main(String[] args) 
	{
		int iNum1=0;
		int iNum2=0;
		int iRes=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		iNum1=entrada.nextInt();
		
		System.out.println("Dame otro número: ");
		iNum2=entrada.nextInt();
		
		iRes = iNum1 + iNum2;
		System.out.println("El resultado es: " + iRes );
		
	}

}
