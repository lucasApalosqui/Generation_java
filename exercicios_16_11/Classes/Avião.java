package exercicios_16_11.Classes;

public class Avião {
	private String agencia;
	private int numero;
	private String escala;
	private String destino;
	
	public static void mostraPassagem(String agencia, int numero, String escala, String destino) {
		System.out.println("Agencia: "+agencia+"\nNumero do voo: "+numero+"\nEscala: "+escala
				+"\nDestino: "+destino);
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
