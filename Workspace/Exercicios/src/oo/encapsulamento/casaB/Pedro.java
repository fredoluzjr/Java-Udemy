package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		
		// System.out.println(mae.segredo);
		// System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDefalar); // n�o precisa instanciar pois ele herda diretamente de Ana. Pode acessar direto
		System.out.println(todosSabem);
	}
}
