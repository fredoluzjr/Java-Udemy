package lambdas;

@FunctionalInterface // Interface Funcional s� pode ter um �nico m�todo
public interface Calculo {

	double executar(double a, double b);
	// double teste(); // n�o pode pois � uma interface funcional
	
	default String legal() { // � poss�vel mesmo em interfaces funcionais
		return "legal";
	}
	
	static String muitolegal() { // � poss�vel mesmo em interfaces funcionais
		return "muito legal";
	}
}
