package exercicios_17_11;

import exercicios_17_11.SubClasses.Cachorro;
import exercicios_17_11.SubClasses.Cavalo;
import exercicios_17_11.SubClasses.Preguiça;
import exercicios_17_11.MetodosAuxiliares.Impressores;

public class Application {
 public static void main(String[] args) {
	Cachorro dog = new Cachorro();
	dog.setNome("cachorro");
	dog.setIdade(5);
	dog.emitirSom();
	dog.agir();
	Impressores.imprimirInfo(dog.getNome(), dog.getIdade());
	System.out.println("\n\n");
	
	Cavalo horse = new Cavalo();
	horse.setNome("Cavalo");
	horse.setIdade(12);
	horse.emitirSom();
	horse.agir();
	Impressores.imprimirInfo(horse.getNome(), horse.getIdade());
	System.out.println("\n\n");
	
	Preguiça sloth = new Preguiça();
	sloth.setNome("Preguiça");
	sloth.setIdade(7);
	sloth.emitirSom();
	sloth.agir();
	Impressores.imprimirInfo(sloth.getNome(), sloth.getIdade());
}
}
