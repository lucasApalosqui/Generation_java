package exercicios_11_11;

import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		int num, qnt=0, soma=0, media;
		Scanner calc = new Scanner(System.in);
		
		do {
			System.out.println("Informe um numero inteiro: ");
			num = calc.nextInt();
			if(num%3 == 0) {
				soma += num;
				qnt += 1;
			}
		}while(num != 0);
		media = soma/qnt;
		System.out.printf("A média dos número múltiplos de 3 é: "+media);
	}
	
}
