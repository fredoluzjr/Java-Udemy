module app.financeiro {
	
	requires java.base; // requerimento do modulo java.base para utilizar os pacote inclu�dos dele; exportado por padr�o
	// requires app.calculo; // Para utilizar a classe Calculadora
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}