package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Convertendo: double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("teste"); // vai aceitar pq teste � diferente de Teste
		conjunto.add('x'); // n�o aceita pq � igual ao que j� foi add
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("Testando")); // retorna false pq n�o h� Testando adicionado
		System.out.println(conjunto.remove("Teste")); // retorna true pq h� Teste adicionado
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains('x')); // retorna false pq foi removido anteriormente
		System.out.println(conjunto.contains(1)); // retorna true pq h� no set
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // Uni�o entre dois conjuntos. Add todos os elementos de nums em conjunto
		conjunto.retainAll(nums); // Os valores em comum entre os sets
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpar
		System.out.println(conjunto);
	}
}
