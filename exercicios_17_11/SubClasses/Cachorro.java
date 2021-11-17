package exercicios_17_11.SubClasses;

import exercicios_17_11.ClasseMae.Animal;

public class Cachorro extends Animal{
	
	@Override
	public void emitirSom() {
		System.out.println("latindo...");
	}
}
