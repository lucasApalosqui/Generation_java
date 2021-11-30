package exercicios_09_11;
/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/


import java.util.Scanner;

public class Exercicio5 {
	public static void main(String [] args) {
		float n1, n2, n3, total;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Informe as 3 notas respectivamente: ");
		n1 = calc.nextFloat();
		n2 = calc.nextFloat();
		n3 = calc.nextFloat();
		
		total = (n1*2 + n2*3 + n3*5) / (2 + 3 + 5);
		 System.out.printf("A média deste aluno é de: " + total);
	}
}
