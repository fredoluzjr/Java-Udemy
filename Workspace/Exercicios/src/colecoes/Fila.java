package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // add -> retorna falso, não add na fila
		fila.offer("Bia"); // offer -> lança um problema, exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafa");
		fila.offer("Aline");
		
		// Peek e Element -> Para pegar um elemento da fila 
		// Diferença é quando a fila estiver vazia
		System.out.println(fila.peek()); // peek -> retorna null
		System.out.println(fila.peek()); // element -> retorna erro, exceção
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Poll e Remove -> Obter o próximo elemento
		// da fila e remove!
		// Diferença é quando a fila está vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // Lança uma exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
	}
}
