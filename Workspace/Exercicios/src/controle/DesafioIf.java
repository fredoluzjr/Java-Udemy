package controle;

public class DesafioIf {
	public static void main(String[] args) {
		
		//resposta
		double nota = 1.3;
			
		if(nota >= 9.0) { // havia um ; depois do par�nteses do If
			System.out.println("Quadro de Honra");
			System.out.println("Voc� � fera!!");
		}
		
		/*
		 * Enunciado - Aparecer� a mensagem ou n�o?
		 * 
		 * Aparecer�! Qual � o erro?
		 
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra");
			System.out.println("Voc� � fera!!");
		}*/
	}
}
