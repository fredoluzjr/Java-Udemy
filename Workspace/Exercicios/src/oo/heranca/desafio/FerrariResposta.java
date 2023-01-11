package oo.heranca.desafio;

public class FerrariResposta extends CarroResposta implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public FerrariResposta() {
		this(315);
	}
	
	public FerrariResposta(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		setDelta(35);
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		setDelta(15);
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
//	@Override
//	public void acelerar() {
//		super.acelerar();
//	}
}
