package exercicios_09_11;
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		int seg, min, hour;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe a dura��o do evento em segundos: ");
		seg = calc.nextInt();
		
		System.out.printf("A dura��o do evento equivale a: " + seg/3600 + " horas " + seg/60 + " minutos " + seg + " segundos");
		
	}
}
