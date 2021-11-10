package exercicios_09_11;
/* 6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula*/


import java.util.Scanner;

public class Exercicio6 {
 public static void main(String [] args) {
	 int x1, x2, y1, y2;
	 double r;
	 Scanner calc = new Scanner(System.in);
	 System.out.println("Informe as coordenadas de partida: ");
	 x1 = calc.nextInt();
	 y1 = calc.nextInt();
	 
	 System.out.println("Informe as coordenadas de destino: ");
	 x2 = calc.nextInt();
	 y2 = calc.nextInt();
	 
	 r = Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0));
	 System.out.printf("O valor da distância entre os dois pontos é de: "+  r);
 }
}
