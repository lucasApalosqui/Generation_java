package exercicios_09_11;
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		int seg, min, hour;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe a duração do evento em segundos: ");
		seg = calc.nextInt();
		
		System.out.printf("A duração do evento equivale a: " + seg/3600 + " horas " + seg/60 + " minutos " + seg + " segundos");
		
	}
}
