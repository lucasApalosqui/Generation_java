package exercicios_16_11;

import exercicios_16_11.Classes.Avião;
import exercicios_16_11.Classes.Cliente;

public class Application_exercices {
	public static void main(String[] args) {
	//EXERCICIO 1 
		Cliente cli1 = new Cliente();
		cli1.setNome("Larissa");
		cli1.setEmail("Lari@gmail.com");
		cli1.setNovo(false);
		cli1.setNumero(11988675443l);
		cli1.setConta(200.00);
		
		Cliente.printResultado(cli1.getNome(),cli1.getNumero(),cli1.getEmail(),cli1.getNovo(),cli1.getConta());
		System.out.println("\n"+"\n");
		
		//EXERCICIO 2
		Avião viagem1 = new Avião();
		viagem1.setAgencia("TAM");
		viagem1.setNumero(200);
		viagem1.setEscala("China e meridiano");
		viagem1.setDestino("Japão");
		
		Avião.mostraPassagem(viagem1.getAgencia(), viagem1.getNumero(), viagem1.getEscala(), viagem1.getDestino());
	}
}
