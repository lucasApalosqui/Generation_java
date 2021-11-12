package exercicios_12_11;
/*Faça um programa onde o
usuário entre com 4 notas e
o programa calcule a média.
Obs.: utilize uma função para
mostrar a média no console*/

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		int notas[] = new int[4];
		Scanner calc = new Scanner(System.in);
		
		for(int cont=0; cont <4;cont++) {
			System.out.println("Informe a "+ (cont + 1)+ "° nota do aluno: ");
			notas[cont] = calc.nextInt();			
		}
		int result = media(notas);
		System.out.println("A média dos números informados é de: "+ result);
	}
	
	
	public static int media(int vet[]) {
		int media = 0;
		for(int cont = 0;cont < vet.length;cont++) {
			media += vet[cont];
		}
		media = media/vet.length;
		return media;
	}
}
