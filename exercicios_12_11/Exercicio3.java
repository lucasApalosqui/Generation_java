package exercicios_12_11;
/*Fa�a um programa onde o
usu�rio entre com 4 notas e
o programa calcule a m�dia.
Obs.: utilize uma fun��o para
mostrar a m�dia no console*/

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		int notas[] = new int[4];
		Scanner calc = new Scanner(System.in);
		
		for(int cont=0; cont <4;cont++) {
			System.out.println("Informe a "+ (cont + 1)+ "� nota do aluno: ");
			notas[cont] = calc.nextInt();			
		}
		int result = media(notas);
		System.out.println("A m�dia dos n�meros informados � de: "+ result);
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
