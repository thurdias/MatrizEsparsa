package MatrizEsparsa;

public class Principal {
	public static void main(String[] args) {
	// Instanciar objeto
	MatrizEsparsa objMatrizEsparsa = new MatrizEsparsa();
	
	for(int i = 0; i < 1000; i++) {
		objMatrizEsparsa.inserir((int) (1000*Math.random()));
	}

	objMatrizEsparsa.mostrar();
	
	System.out.println(objMatrizEsparsa.procurar(20) ? "ACHEI !!" : "ME FODI !!"); 

	objMatrizEsparsa.remover(20);	
	
	System.out.println(objMatrizEsparsa.procurar(20) ? "ACHEI !!" : "ME FODI !!");

	}
}
