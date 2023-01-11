package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<>(); // <String> significa que obrigatoriamente a lista será tipo String = Homogêneo. Depois pode ser colocado <> pq o Java já entende que tbm será tipo String
		//SortedSet<String> listaAprovados = new HashSet<>(); // TreeSet() Alguma ordenação
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(200);
		nums.add(120);
		nums.add(6);
		
		// nums.get(1); Não é possível acessar pelo índice
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
