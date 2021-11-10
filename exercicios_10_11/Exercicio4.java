package exercicios_10_11;
/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;
 
public class Exercicio4 {
	public static void main(String[] args) {
		int num;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe um numero qualquer: ");
		num = calc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O numero " + num + " é par e sua raiz quadrada é " + Math.sqrt(num));
		}
		else {
			System.out.printf("O numero " + num + " é impar e elevado a 2° potencia equivale a " + Math.pow(num,2));
		}
	}
}
