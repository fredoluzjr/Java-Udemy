package oo.abstrato;

public class Cachorro extends Mamifero{ // como é concreto, preciso implementar todos os métodos abstratos que foram acumulados ao longo da hierarquia de classes 

//	@Override
//	public String mover() {
//		return "Usando as patas";
//	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
