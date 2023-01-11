import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo {
	requires transitive app.logging; // Aquilo que recebeu de outro módulo, receberá de forma transistiva e estará disponível para acesso
	exports br.com.cod3r.app.calculo; // Precisa exportar para poder utilizar em outro módulo
	
	exports br.com.cod3r.app.calculo.interno
		to app.financeiro;
	
	opens br.com.cod3r.app.calculo
		to app.financeiro;
	
	requires app.api;
	provides br.com.cod3r.app.Calculadora
		with CalculadoraImpl;
}