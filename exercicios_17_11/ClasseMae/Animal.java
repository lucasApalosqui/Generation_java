package exercicios_17_11.ClasseMae;

public class Animal {
	private String nome;
	private int idade;
	
	public void emitirSom() {
		System.out.println("Emitindo som...");
	}
	
	public void agir() {
		System.out.println("Correndo..");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
