package exercicios_09_11;
/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: */


import java.util.Scanner;

public class Exercicio4 {
	public static void main(String [] args) {
		int a, b, c, d, r, s;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe o valor de A, B e C respectivamente: ");
		a = calc.nextInt();
		b = calc.nextInt();
		c = calc.nextInt();
		
		r = (a + b)*(a + b);
		s = (b + c)*(b + c);
		d = (r + s)/2;
		
		System.out.printf("O valor de A é: "+ a+ " O valor de B é: "+ b+" O valor de C é: "+ c+ " O valor de D é: "+ d+  " O valor de R é: "+ r+  " O valor de S é: "+ s);
	}
}
