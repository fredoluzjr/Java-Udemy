package classe;

public class Calculadora {
	
	double resultado;
	
	// 4 tipos de métodos
	
	double somar(double a, double b) { // entrada e saída de dados
		resultado = a + b;
		return resultado;
	}
	
	void acrescentar(double a) { // apenas entrada de dados
		resultado += a;
	}
	
	double obterResultado() { // apenas saída de dados
		return resultado;
	}
	
	void limpar() { // nem entrada e nem saída de dados
		resultado = 0;
	}
}
