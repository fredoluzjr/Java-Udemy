package classe;

public class Produto {
	
	String nome; // Atributos de classe 
	double preco;
	static double desconto = 0.25;  // com static pertencer� � classe. 
	
	Produto() {
		
	}
	
	Produto(String nomeInicial) { 
		nome = nomeInicial; // Atributos de inst�ncia (objeto)
	}
	
	Produto(String nomeInicial, double precoInicial) {
			//, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}
		
	double precoComDesconto() { // M�todo = alguma a��o -> retorno nome (par�metros) 
		return preco * (1 - desconto);
	}
}