package oo.abstrato;

public abstract class Mamifero extends Animal{

	public abstract String mamar();
	
	@Override
	public final String mover() { // final n�o pode ser subescrito na subclasse, no caso, Cachorro
		return "Saindo do lugar";
	}
}