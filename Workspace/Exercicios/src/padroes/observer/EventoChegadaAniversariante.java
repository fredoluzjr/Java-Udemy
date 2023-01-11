package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

	private final Date momento; // momento que aconteceu o evento

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
}
