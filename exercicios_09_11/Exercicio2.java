package exercicios_09_11;
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. */


import java.util.Scanner;

public class Exercicio2 {
	public static void main(String [] args) {
		int dia, mes, ano;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Informe o valor em dias: ");
		dia = num.nextInt();
		
		System.out.printf("idade em anos: " + dia/365 + " meses: " + dia/12 + " dias: " + dia);
	
	}
}
