package exercicios_10_11;
/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/


import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		int n1, n2, n3, maior;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe 3 numeros inteiros: ");
		n1 = calc.nextInt();n2 = calc.nextInt();n3 = calc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		
		System.out.printf("O maior numero digitado foi "+ maior );
	}
}
