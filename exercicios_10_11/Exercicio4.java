package exercicios_10_11;
/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;
 
public class Exercicio4 {
	public static void main(String[] args) {
		int num;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe um numero qualquer: ");
		num = calc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O numero " + num + " � par e sua raiz quadrada � " + Math.sqrt(num));
		}
		else {
			System.out.printf("O numero " + num + " � impar e elevado a 2� potencia equivale a " + Math.pow(num,2));
		}
	}
}
