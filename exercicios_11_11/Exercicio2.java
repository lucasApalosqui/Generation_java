package exercicios_11_11;
/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */


import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		int par = 0, impar = 0, num;
		Scanner calc = new Scanner(System.in);
		for(int cont = 0; cont < 10; cont++) {
			System.out.println("Digite um n�mero: ");
			num = calc.nextInt();
			
			if(num%2 == 0) {
				par += 1;
			}
			else {
				impar += 1;
			}
		}
		System.out.printf("A quantidade de numeros pares � de " + par + "\nA quantidade de impares � de "+impar);
	}
}
