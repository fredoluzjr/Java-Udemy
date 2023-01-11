package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) { // Colocando o tipo comida, n�o precisa fazer o polimorfismo est�tico, adicionar cada comida no m�todo comer. Passou a ser polimorfismo din�mico. 
		this.peso += comida.getPeso();
	}
	
//	public void comer(Arroz arroz) { // Polimorfismo est�tico: mesmo nome mas com tipos diferentes, neste caso, de comidas.
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
