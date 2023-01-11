package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<>(); // <String> significa que obrigatoriamente a lista ser� tipo String = Homog�neo. Depois pode ser colocado <> pq o Java j� entende que tbm ser� tipo String
		//SortedSet<String> listaAprovados = new HashSet<>(); // TreeSet() Alguma ordena��o
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
		
		// nums.get(1); N�o � poss�vel acessar pelo �ndice
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
