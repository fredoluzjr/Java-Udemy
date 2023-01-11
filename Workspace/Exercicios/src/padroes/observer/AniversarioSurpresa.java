package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservador(namorada); // porteiro terá a referência da namorada e passando por todos os interessandos, poder notificar ela
		
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa viz lambda!");
			System.out.println("Ocorreu em: " + e.getMomento());
		});
		
		porteiro.monitorar();
	}
}
