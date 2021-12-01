package exercicios_09_11;
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/


import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		int mes, dia, ano;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe o mes, dia e ano respectivamente: ");
		mes = calc.nextInt();
		dia = calc.nextInt();
		ano = calc.nextInt();
		
		System.out.printf("Sua idade em dias equivale a: " + (ano*365 + mes*12 + dia*31) + " dias");
	}
}
