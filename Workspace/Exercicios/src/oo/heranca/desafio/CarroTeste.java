package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(80);
		Civic civic = new Civic(60);
		
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		ferrari.acelerar(ferrari);
		civic.acelerar(civic);
		
		ferrari.frear(ferrari);
		civic.frear(civic);
		ferrari.frear(ferrari);
		civic.frear(civic);
		ferrari.frear(ferrari);
		civic.frear(civic);
		ferrari.frear(ferrari);
		civic.frear(civic);
		ferrari.frear(ferrari);
		civic.frear(civic);
		
		System.out.println("Ferrari ==> " + ferrari.velocidade);
		System.out.println("Civic ==> " + civic.velocidade);
	}
}
