package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(int velocidade) {
		super(velocidade);
	}
	
	boolean acelerar(Carro carro) {
		
		boolean acelerar1 = super.acelerar(carro);
		boolean acelerar2 = super.acelerar(carro);
		boolean acelerar3 = super.acelerar(carro);
		return acelerar1 || acelerar2 || acelerar3;
	}
}
