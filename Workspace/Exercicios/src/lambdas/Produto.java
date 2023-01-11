package lambdas;

public class Produto extends Object{

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) { // Source; Generate construction using Fields
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal;
	}
}
