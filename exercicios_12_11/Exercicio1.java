package exercicios_12_11;
/*Fa�a um programa onde o
usu�rio entre com 4 notas
num vetor chamado m�dia, e
o programa mostre a m�dia.*/


import java.util.Scanner;
public class Exercicio1 {
	 public static void main(String[] args) {
		 int media [] = new int [4];
		 int soma = 0;
		 Scanner calc = new Scanner(System.in);
		 
		 for(int con= 0; con < 4; con++) {
			 System.out.printf("Informe a "+ (con + 1)+ "� nota do aluno: ");
			 media[con] = calc.nextInt();
			 soma += media[con];
		 }
		 System.out.printf("A m�dia dos n�meros digitados foi de: "+ soma/media.length);
		
	}
}
