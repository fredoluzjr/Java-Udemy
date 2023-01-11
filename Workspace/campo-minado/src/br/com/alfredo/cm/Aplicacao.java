package br.com.alfredo.cm;

import br.com.alfredo.cm.modelo.Tabuleiro;
import br.com.alfredo.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}
