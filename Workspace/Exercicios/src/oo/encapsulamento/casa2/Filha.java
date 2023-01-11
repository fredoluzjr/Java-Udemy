package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido est� quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem... " + euMesma.segredoDoCasal);
		
		// Genro meuAmor = new Genro();
		// System.out.println(meuAmor.segredo); // n�o tem acesso pq � private n�o est� na mesma classe
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		// Sogra mamae = new Sogra(); // n�o pode instanciar pois j� foi herdada a classe
		// System.out.println(mamae.segredoDeFamilia);
		
		System.out.println(euMesma.segredoDeFamilia);
	}
}
