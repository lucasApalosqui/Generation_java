package exercicios_12_11;
/*Faça um programa onde o
usuário entre com 4 notas de
3 alunos diferentes e o
programa mostre as médias.*/



import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		int media[][] = new int [3][4];
		int soma[] = new int [3];
 		Scanner calc = new Scanner(System.in);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 4; c++) {
				System.out.printf("Informe a "+(c + 1)+"° nota do "+(l+1)+"° aluno: ");
				media[l][c] = calc.nextInt();
				soma[l] += media[l][c];
			}
		}
		for(int l = 0;l<3;l++) {
			System.out.print("A média do "+(l+1)+ "° aluno é de: "+soma[l]/4+"\n");
		}
	}
}
