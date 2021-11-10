package exercicios_10_11;
/*2- Faça um programa que entre com três números e coloque em ordem crescente. */


import java.util.Scanner;

public class Exercicio2 {
	public static void main (String [] args) {
		int n1, n2, n3;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe 3 numeros inteiros: ");
		n1 = calc.nextInt();n2 = calc.nextInt();n3 = calc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			if(n2 > n3) {
				System.out.printf(n3 + ", " + n2  + ", " + n1);
			}
			else {
				System.out.println(n2  + ", " + n3  + ", " +  n1);
			}
		}
		else if(n2 > n1 && n2 > n3) {
			if(n1 > n3) {
				System.out.println(n3  + ", " +  n1  + ", " +  n2);
			}
			else {
				System.out.println(n1  + ", " +  n3  + ", " +  n2);
			}
		}
		else {
			if(n1 > n2) {
				System.out.println(n2  + ", " +  n1  + ", " +  n3);
			}
			else {
				System.out.println(n1  + ", " +  n2  + ", " +  n3);
			}
		}
	}
}
