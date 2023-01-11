package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) { // Colocando o tipo comida, não precisa fazer o polimorfismo estático, adicionar cada comida no método comer. Passou a ser polimorfismo dinâmico. 
		this.peso += comida.getPeso();
	}
	
//	public void comer(Arroz arroz) { // Polimorfismo estático: mesmo nome mas com tipos diferentes, neste caso, de comidas.
//		this.peso += arroz.getPeso();	
//	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
}
