package br.com.cod3r.app.financeiro;

//import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;
//import br.com.cod3r.app.calculo.CalculadoraImpl;
//import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();		
		System.out.println(calc.soma(2, 3, 4));
		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4, 5, 6));
//		
//		try {
//			Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//			fieldId.setAccessible(true);
//			fieldId.set(calc, "def");
//			fieldId.setAccessible(false);
//			System.out.println(calc.getId());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(CalculadoraImpl.class.getDeclaredFields()[0].getName());
	}
}
