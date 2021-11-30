package exercicios_11_11;
/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */


import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		int idade, maior50 = 0, menor21 = 0;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe uma idade: ");
		idade = calc.nextInt();
		while(idade != -99) {
			if(idade < 21) {
				menor21 += 1;
			}
			else if(idade > 50) {
				maior50 += 1;
			}
			System.out.println("Informe uma idade: ");
			idade = calc.nextInt();
		}
		System.out.printf("A quantidade de pessoas com idade maior que 50 anos é de "+maior50+"\nA quantidade de pessoas com idade menor de 21 é de "+menor21);
	}
}
