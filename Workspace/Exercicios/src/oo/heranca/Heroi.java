package oo.heranca;

public class Heroi extends Jogador { // Heroi vai herdar o Jogador
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente); // chamar o metodo da super classe
		boolean ataque2 = super.atacar(oponente); // dois ataques para tirar o dobro da vida
		return ataque1 || ataque2;
		
		/*int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20; // vantagem sobre o Monstro, tira mais vida no ataque
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}*/
	}
}
