package oo.heranca.teste;

import oo.heranca.desafio.CivicResposta;
import oo.heranca.desafio.FerrariResposta;

public class CarroTesteResposta {
	public static void main(String[] args) {
		
		CivicResposta c1 = new CivicResposta();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);

		FerrariResposta c2 = new FerrariResposta(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.velocidadeDoAr());
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
	}
}
