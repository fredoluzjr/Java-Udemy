package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) { // <?> ainda não especifica o tipo utilizado na lista. Será preciso fazer casts
		return lista.get(lista.size() - 1); // pegando o ultimo elemento da lista
	}
	
	public static <T> T getUltimo2(List<T> lista) { // o tipo <T> está sendo definido aqui. Não será preciso se preocupar com cast
		return lista.get(lista.size() - 1); 
	}
	
//	public static <A, B, C> C teste(A paramA, B paramB) { // pode ter mais de um tipo generico, mas não é comum
//		C teste = null;
//		return teste;
//	}
}
