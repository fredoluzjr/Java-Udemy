package controle;

public class For1 {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 10; contador += 2) {
			System.out.printf("i = %d\n", contador);
		} // quantidade determinada de repetições
		// for (inicio; condição; ação a cada laço)
		
		int x = 2; 
		for(;x < 10;) { // estrutura for não muito aconselhável
			System.out.println("x = " + x);
			++x;
		}
		
		// Laço infinito
//		for(;;) {
//			System.out.println("Fim!");
//		}
	}
}
