package com.algoritmos_basicos.main;
import java.util.Scanner;

public class App9_SerieDosNumeros {

	public static void main(String[] args) {
		int iNum1;
		int iNum2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		iNum1= entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		iNum2= entrada.nextInt();
		
		for(int j=1;j<=3;j++) {
			if(j==1) {
				for(int i=iNum1; i<=iNum2; i+=1) {
					System.out.print(i+" ");
				}
				System.out.println(" ");
				for(int k=iNum2;k>=iNum1;k--) {
					System.out.print(k+" ");
				}
			}
			else if(j==2) {
				System.out.println(" ");
				for(int i=iNum1; i<=iNum2; i+=3) {
					System.out.print(i+" ");
				}
			}
			else if(j==3) {
				System.out.println(" ");
				for(int i=iNum1; i<=iNum2; i+=5) {
					System.out.print(i+" ");
				}
			}
			
		}
	}

}


