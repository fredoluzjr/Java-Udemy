package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F) true false
		// Trabalho na quinta (V ou F)
	
		boolean trabalho1 = false; 
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		
		System.out.println("Vai comprar tv 50? " + tv50);
		
		boolean tv32 = trabalho1 || trabalho2;
		
		System.out.println("Vai comprar tv 32? " + tv32);
		
		boolean sorvete = tv50 || tv32;
		
		System.out.println("Vão tomar sorvete? " + sorvete);
		
	}
}
