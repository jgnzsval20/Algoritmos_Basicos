package com.algoritmos_basicos.main;

public class App8_SerieAl100 {

	public static void main(String[] args) {
		
		for(int j=1;j<=3;j++) {
			if(j==1) {
				for(int i=2; i<=1000; i+=2) {
					System.out.print(i+" ");
				}
			}
			else if(j==2) {
				for(int i=3; i<=1000; i+=3) {
					System.out.print(i+" ");
				}
			}
			else if(j==3) {
				for(int i=5; i<=1000; i+=5) {
					System.out.print(i+" ");
				}
			}
			System.out.println(" ");
		}
	}
}
