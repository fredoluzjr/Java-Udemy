package oo.polimorfismo; // tipo de heran�a mais generico e as comidas s�o os tipos mais espc�ficos, herdam de comida

public abstract class Comida { // Como eu quero limitar esta instancia��o de Comida, posso marcar como abstract
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
