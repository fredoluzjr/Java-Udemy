package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Ste"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3)); // consegue acessar pelo �ndice
		
		System.out.println(">>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Ste est�? " + lista.contains(new Usuario("Ste")));
		System.out.println("Ana est�? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
