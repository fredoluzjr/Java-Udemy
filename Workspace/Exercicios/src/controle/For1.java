package controle;

public class For1 {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 10; contador += 2) {
			System.out.printf("i = %d\n", contador);
		} // quantidade determinada de repeti��es
		// for (inicio; condi��o; a��o a cada la�o)
		
		int x = 2; 
		for(;x < 10;) { // estrutura for n�o muito aconselh�vel
			System.out.println("x = " + x);
			++x;
		}
		
		// La�o infinito
//		for(;;) {
//			System.out.println("Fim!");
//		}
	}
}
