package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto"); // put -> colocar pela 1ª vez
		usuarios.put(1, "Ricardo"); // ou colocar no lugar de
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Roger");
		usuarios.put(4, "Rebeca");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // Pega chave
		System.out.println(usuarios.values()); // Pega valor
		System.out.println(usuarios.entrySet()); // Pega chave e valor, ao mesmo tempo
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(20));
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(2));
		System.out.println(usuarios.remove(4, "Gui"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) { // percorrer todos os usuarios ao mesmo tempo
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
