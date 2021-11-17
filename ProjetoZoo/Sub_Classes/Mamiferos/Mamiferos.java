package ProjetoZoo.Sub_Classes.Mamiferos;

import ProjetoZoo.Classe_Mae.Animal;

public class Mamiferos extends Animal {
	
	@Override
	public void som() {
		System.out.println("Emitindo som...");
	}
	
	public void alimentar() {
		System.out.println("Amamentando...");
	}
	
	
	
}
