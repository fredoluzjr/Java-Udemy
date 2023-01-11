package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); // add -> retorna falso, n�o add na fila
		fila.offer("Bia"); // offer -> lan�a um problema, exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafa");
		fila.offer("Aline");
		
		// Peek e Element -> Para pegar um elemento da fila 
		// Diferen�a � quando a fila estiver vazia
		System.out.println(fila.peek()); // peek -> retorna null
		System.out.println(fila.peek()); // element -> retorna erro, exce��o
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Poll e Remove -> Obter o pr�ximo elemento
		// da fila e remove!
		// Diferen�a � quando a fila est� vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // Lan�a uma exce��o
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
	}
}
