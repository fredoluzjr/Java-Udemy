module app.financeiro {
	
	requires java.base; // requerimento do modulo java.base para utilizar os pacote incluídos dele; exportado por padrão
	// requires app.calculo; // Para utilizar a classe Calculadora
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}