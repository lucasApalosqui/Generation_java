package exercicios_11_11;
/* 4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o n�mero de pessoas calmas;
 o n�mero de mulheres nervosas;
 o n�mero de homens agressivos;
 o n�mero de outros calmos;
 o n�mero de pessoas nervosas com mais de 40 anos;
 o n�mero de pessoas calmas com menos de 18 anos. */


import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		int qnt = 0, menu1, menu2, Pcal=0, Mner=0, Hagr=0, Ocal=0, idade;
		int Ner40 = 0, Cal18=0;
		Scanner calc = new Scanner(System.in);
		
		while(qnt < 150) {
			System.out.println("informe sua idade: ");
			idade = calc.nextInt();
			System.out.printf("Voc� se considera de qual sexo: \n1-Feminino \n2-Masculino \n3-Outro\n");
			menu1 = calc.nextInt();
			if(menu1 != 1 && menu1 != 2 && menu1 != 3) {
				System.out.println("Op��o inv�lida, tente novamente");
				menu1 = calc.nextInt();
			}
			System.out.println("Voc� se considera uma pessoa: \n1-Calma \n2-Nervosa \n3-Agressiva\n");
			menu2 = calc.nextInt();
			if(menu2 != 1 && menu2 != 2 && menu2 != 3) {
				System.out.println("Op��o inv�lida, tente novamente");
				menu1 = calc.nextInt();
			}
			if(menu2 == 1) {
				Pcal += 1;
			}
			else if(menu1 == 1 && menu2 == 2) {
				Mner += 1;
			}
			else if(menu1 == 1 && menu2 == 3) {
				Hagr += 1;
			}
			else if(menu1 == 3 && menu2 == 1) {
				Ocal += 1;
			}
			else if(menu2 == 2 && idade > 40) {
				Ner40 += 1;
			}
			else if(menu2 == 1 && idade < 18) {
				Cal18 += 1;
			}
			qnt +=1;
		
			}
		System.out.printf("� n�mero de pessoas calmas: "+ Pcal + "\n");
		System.out.printf("� n�mero de mulheres nervosas: "+ Mner+ "\n");
		System.out.printf("� n�mero de homens agressivos: "+ Hagr+ "\n");
		System.out.printf("� n�mero de outros calmos: "+ Ocal+ "\n");
		System.out.printf("� n�mero de pessoas nervosas com mais de 40 anos: "+ Ner40+ "\n");
		System.out.printf("� n�mero de pessoas calmas com menos de 18 anos: "+ Cal18+ "\n");
	}
}
