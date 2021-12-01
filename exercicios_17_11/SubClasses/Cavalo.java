package exercicios_17_11.SubClasses;

import exercicios_17_11.ClasseMae.Animal;

public class Cavalo extends Animal{
	
	@Override
	public void emitirSom() {
		System.out.println("Relinchando");
	}
	
}
