package generics;

public class Caixa<T> { // usando o generics. Tipo generica e na hora de instanciar, ser� declarado o tipo espec�fico

	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
