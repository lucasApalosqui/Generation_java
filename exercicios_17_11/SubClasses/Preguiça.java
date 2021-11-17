package exercicios_17_11.SubClasses;

import exercicios_17_11.ClasseMae.Animal;

public class Preguiça extends Animal {
	@Override
	public void emitirSom() {
		System.out.println("murmurando...");
	}
	
	@Override
	public void agir() {
		System.out.println("Escalando árvores...");
	}
}
