package classe;

public class AreaCirc {
	
	double raio;
	static double pi = 3.14; // atributo estático, pertence à classe
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
