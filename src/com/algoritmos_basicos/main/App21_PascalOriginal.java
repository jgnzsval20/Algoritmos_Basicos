package com.algoritmos_basicos.main;
import java.util.Scanner;
public class App21_PascalOriginal {
	
	static double calculaFact(int n)
	{	
		double iFact=1;
		for(int i=1;i<=n;i+=1) {
			iFact *= i;
		}
	    return iFact;
	}
	

	public static void main(String[] args) {
		int iNsimo;
		double iNfact;
		double iKfact;
		double iNmKfact;
		double iTermino;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nTRIANGULO DE PASCAL\n");
		System.out.println("Introduce 'n'");
		iNsimo = entrada.nextInt();
		
		System.out.println("\n ["+0+"] "+Math.round(calculaFact(0)));
		for(int n = 1; n <= iNsimo ; n+=1)
		{
			System.out.print(" ["+n+"] "+1);

			for(int k = 1; k < n + 1; k+=1)
			{	
				iNfact=calculaFact(n);
				iKfact=calculaFact(k);
				iNmKfact=calculaFact(Math.abs(n-k));
				iTermino=iNfact/(iKfact*iNmKfact);
				System.out.print("-" + Math.round(iTermino));
			}
			
			System.out.println(" ");
		}
	}

}
