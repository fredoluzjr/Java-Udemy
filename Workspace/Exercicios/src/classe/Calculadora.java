package classe;

public class Calculadora {
	
	double resultado;
	
	// 4 tipos de m�todos
	
	double somar(double a, double b) { // entrada e sa�da de dados
		resultado = a + b;
		return resultado;
	}
	
	void acrescentar(double a) { // apenas entrada de dados
		resultado += a;
	}
	
	double obterResultado() { // apenas sa�da de dados
		return resultado;
	}
	
	void limpar() { // nem entrada e nem sa�da de dados
		resultado = 0;
	}
}
