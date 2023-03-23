package MatrizEsparsa;

public class No {
	// Propriedades da classe
	private int numero = 0;
	private No proximo = null;
	
	// Método construtor vazio da classe
	public No() {
		super();
	}
	
	// Método construtor cheio da classe
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}
	
	// Métodos get/set da classe
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
