package classe;

public class ProdutoTeste {
	public static void main(String[] args) { // Método main

		Produto p1 = new Produto("Notebook", 4356.89);
				//, 0.25);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//Produto.desconto = 0.29; // poderá ser alterado diretamente na classe, no caso, Produto
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
		
		//System.out.println("\n" + p1.desconto); // se em p2 for alterado o desconto, alterará em todos os desconto
		//System.out.println(p2.desconto); // senão, vai manter o valor declarado na classe como static
	}
}
