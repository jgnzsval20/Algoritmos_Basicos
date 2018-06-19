package com.algoritmos_basicos.main;


public class App16_SumaParesPrimos {

	public static void main(String[] args) {
		int iRes=0;
				
		for(int i=100; i<=200;i+=1) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					iRes=iRes+i;
				}
			}
			if(i%2==0) {
				iRes=iRes+i;
			}
		}
		System.out.println("Suma = "+iRes);
	}
	
}

