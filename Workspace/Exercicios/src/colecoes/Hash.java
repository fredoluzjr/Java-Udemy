package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("John"));
		usuarios.add(new Usuario("Guida"));
		usuarios.add(new Usuario("Jorge"));
		
		boolean resultado = usuarios.contains(new Usuario("Guida"));
		System.out.println(resultado);
		
		// Se comentar o hashcode em Usuario, retorna false
		// Pq ele varre primeiro utilizando o hash e 
		// se não encontra, retorna false
		
		// Importante utilizar o equals e o hashcode
	}
}
