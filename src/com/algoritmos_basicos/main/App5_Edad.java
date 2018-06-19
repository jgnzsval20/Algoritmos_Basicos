package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App5_Edad 
{

	public static void main(String[] args) 
	{
		int iEdad = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame tu edad: ");
		iEdad = entrada.nextInt();
		
		if (iEdad<5) 
		{
			System.out.println("Niño");
		}
		else if (iEdad>=5 && iEdad<18)
		{
			System.out.println("Eres un Adolescente");
		}
		else if (iEdad>18 && iEdad<36)
		{
			System.out.println("Eres un Chavo-Ruco");
		}
		else if (iEdad==36)
		{
			System.out.println("Eres Inmortal");
		}
		else if (iEdad>36)
		{
			System.out.println("Eres un Viejito");
		}
	}
}