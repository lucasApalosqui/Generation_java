package exercicios_09_11;
/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: */


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
		
		System.out.printf("O valor de A �: "+ a+ " O valor de B �: "+ b+" O valor de C �: "+ c+ " O valor de D �: "+ d+  " O valor de R �: "+ r+  " O valor de S �: "+ s);
	}
}
