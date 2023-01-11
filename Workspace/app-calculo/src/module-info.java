import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo {
	requires transitive app.logging; // Aquilo que recebeu de outro m�dulo, receber� de forma transistiva e estar� dispon�vel para acesso
	exports br.com.cod3r.app.calculo; // Precisa exportar para poder utilizar em outro m�dulo
	
	exports br.com.cod3r.app.calculo.interno
		to app.financeiro;
	
	opens br.com.cod3r.app.calculo
		to app.financeiro;
	
	requires app.api;
	provides br.com.cod3r.app.Calculadora
		with CalculadoraImpl;
}