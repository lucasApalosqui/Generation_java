package exercicios_11_11;
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */


import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		double num, soma=0;
		Scanner calc = new Scanner(System.in);
		do {
			System.out.println("Informe um numero: ");
			num = calc.nextDouble();
			soma +=num;
		}while(num != 0);
		
		System.out.printf("A soma dos numeros digitados é de: "+soma);
	}
}
