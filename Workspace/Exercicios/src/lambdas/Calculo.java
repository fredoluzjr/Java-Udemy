package lambdas;

@FunctionalInterface // Interface Funcional só pode ter um único método
public interface Calculo {

	double executar(double a, double b);
	// double teste(); // não pode pois é uma interface funcional
	
	default String legal() { // é possível mesmo em interfaces funcionais
		return "legal";
	}
	
	static String muitolegal() { // é possível mesmo em interfaces funcionais
		return "muito legal";
	}
}
