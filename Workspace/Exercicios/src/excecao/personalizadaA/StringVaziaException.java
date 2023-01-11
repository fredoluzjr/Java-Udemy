package excecao.personalizadaA;

@SuppressWarnings("serial") // serializa��o
public class StringVaziaException extends RuntimeException {

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' est� vazio", 
				nomeDoAtributo);
	}
}
