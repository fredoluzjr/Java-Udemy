package generics;

public class CaixaObjeto { // n�o est� usando o generics

	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
