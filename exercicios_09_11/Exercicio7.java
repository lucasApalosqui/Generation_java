package exercicios_09_11;
/* 7. Um sistema de equações lineares do tipo:
, pode ser resolvido segundo mostrado abaixo :
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y. */


import java.util.Scanner;

public class Exercicio7 {
	public static void main(String [] args) {
		int a, b, c, d, e, f, x, y;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("informe os valores de a, b, c, d, e e f respectivamente: ");
		a = calc.nextInt();b = calc.nextInt();c = calc.nextInt();d = calc.nextInt();e = calc.nextInt();f = calc.nextInt();
		
		x = ((c * e) - (b * f))/ ((a * e) - (b * d));
		y = ((a * f) - (c * d))/ ((a * e) - (b * d));
		
		System.out.printf("O valor de X e Y são respectivamente : "+  x + " e "+ y);
	}
}
