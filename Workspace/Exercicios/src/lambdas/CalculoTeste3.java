package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// Não permite: int -> Double
		// Precisa ser: double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; }; // Tipo de parâmetro para utilizar: BinaryOperator é uma interface funcional. 
		System.out.println(calc.apply(2.0, 3.0)); // mudou para apply 
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; }; // <tipo Generic> vai definir o tipo que vai ser recebido e vai ser retornado
		System.out.println(calc2.apply(2, 3));
		
		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
