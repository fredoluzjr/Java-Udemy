package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade = 0;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	boolean acelerar(Carro carro) {
		if (carro.velocidade + delta > VELOCIDADE_MAXIMA) {
			carro.velocidade = VELOCIDADE_MAXIMA;
			return true;
		} else {
			carro.velocidade += delta;
			return true;
		}
	}
	
	boolean frear(Carro carro) {
		if(velocidade > 0) {
			carro.velocidade -= 5;
		}
		return true;
	}
}
