package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App11_Fibonacci 
{

	public static void main(String[] args) 
	{
		int iNum = 0;
		int nm1 = 1;
		int nm2 = 1;
		int iOut = 0;
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Introduce un número: ");
		iNum = entrada.nextInt();
		
		for(int i=1; i<=iNum;i++)
		{
			if(i<=2)
			{
				System.out.print(1 + ", ");
			}
			else {
				iOut=nm1+nm2;
				System.out.print(iOut + ", ");
				nm2=nm1;
				nm1=iOut;
			}
		}
	}
}
