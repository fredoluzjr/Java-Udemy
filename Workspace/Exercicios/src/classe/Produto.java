package classe;

public class Produto {
	
	String nome; // Atributos de classe 
	double preco;
	static double desconto = 0.25;  // com static pertencerá à classe. 
	
	Produto() {
		
	}
	
	Produto(String nomeInicial) { 
		nome = nomeInicial; // Atributos de instância (objeto)
	}
	
	Produto(String nomeInicial, double precoInicial) {
			//, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}
		
	double precoComDesconto() { // Método = alguma ação -> retorno nome (parâmetros) 
		return preco * (1 - desconto);
	}
}