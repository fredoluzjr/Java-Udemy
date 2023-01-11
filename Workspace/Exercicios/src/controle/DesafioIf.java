package controle;

public class DesafioIf {
	public static void main(String[] args) {
		
		//resposta
		double nota = 1.3;
			
		if(nota >= 9.0) { // havia um ; depois do parênteses do If
			System.out.println("Quadro de Honra");
			System.out.println("Você é fera!!");
		}
		
		/*
		 * Enunciado - Aparecerá a mensagem ou não?
		 * 
		 * Aparecerá! Qual é o erro?
		 
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra");
			System.out.println("Você é fera!!");
		}*/
	}
}
