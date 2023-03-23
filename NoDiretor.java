package MatrizEsparsa;

public class NoDiretor {
	// Propriedades da classe
	private int numero = 0;
	private NoDiretor proximoDiretor = null;
	private No proximoNo = null;
	
	// Método construtor vazio da classe
	public NoDiretor() {
		super();
	}
	
	// Método construtor vazio da classe
	public NoDiretor(int numero, NoDiretor proximoDiretor, No proximoNo) {
		super();
		this.numero = numero;
		this.proximoDiretor = proximoDiretor;
		this.proximoNo = proximoNo;
	}
	
	// Métodos get/set da classe
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public NoDiretor getProximoDiretor() {
		return proximoDiretor;
	}
	public void setProximoDiretor(NoDiretor proximoDiretor) {
		this.proximoDiretor = proximoDiretor;
	}
	public No getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
}
