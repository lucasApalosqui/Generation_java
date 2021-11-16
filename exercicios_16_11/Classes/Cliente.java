package exercicios_16_11.Classes;

public class Cliente {
	private String nome;
	private Long numero;
	private String email;
	private Boolean novo;
	private Double conta;
	
	public static void printResultado(String nome, Long numero, String email, Boolean novo, Double conta) {
		System.out.println("Nome: "+nome+"\nEmail: "+email+"\nNumero: "+numero
		+"\nCliente novo: "+novo+"\nValor: "+ conta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}

	public Double getConta() {
		return conta;
	}

	public void setConta(Double conta) {
		this.conta = conta;
	}
	
	
	
}
