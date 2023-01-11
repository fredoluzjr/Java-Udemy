package excecao.personalizadaB;

@SuppressWarnings("serial") // serializa��o
public class StringVaziaException extends Exception {

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' est� vazio", 
				nomeDoAtributo);
	}
}
