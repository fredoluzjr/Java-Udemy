package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umaLista = // Supplier não recebe parâmetro e retorna algo
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
		System.out.println(umaLista.get());
	}
}
