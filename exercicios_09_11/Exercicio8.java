package exercicios_09_11;
/* 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor. */


import java.util.Scanner;

public class Exercicio8 {
	public static void main(String [] args){
		double custoF,imposto, consu, distri;
		Scanner calc = new Scanner(System.in);
		System.out.println("Informe o valor do custo de fabrica do veiculo: ");
		
		custoF = calc.nextFloat();
		
		imposto = custoF * 0.28;
		distri = custoF * 0.45;
		consu = custoF + distri + imposto;
		
		System.out.printf("O valor do veiculo para o consumidor � de: "+ consu);
		 
		 
		
	}
}
