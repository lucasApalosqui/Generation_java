package exercicios_11_11;
/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
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
		
		System.out.printf("A soma dos numeros digitados � de: "+soma);
	}
}
