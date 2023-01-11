package oo.polimorfismo; // tipo de herança mais generico e as comidas são os tipos mais espcíficos, herdam de comida

public abstract class Comida { // Como eu quero limitar esta instanciação de Comida, posso marcar como abstract
	private double peso; 

	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
}
