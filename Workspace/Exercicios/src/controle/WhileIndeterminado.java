package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) { // continuar� executando o programa enquanto a palavra digitada for diferente de sair
			System.out.print("Voc� diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
