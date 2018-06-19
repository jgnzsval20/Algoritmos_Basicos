package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App10_Primos 
{

	public static void main(String[] args) 
	{
		int iNum = 0;
		boolean isPrimo=true;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un número: ");
		iNum=entrada.nextInt();
		
		for(int cont=2; cont<iNum;cont++) 
		{
			if(iNum%cont==0)
			{
				isPrimo=false;
			}
		}
		System.out.println("El numero introducido es primo? \n"+isPrimo);
	}
}


