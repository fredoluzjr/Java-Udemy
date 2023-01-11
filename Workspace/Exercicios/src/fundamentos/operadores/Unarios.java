package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // a = 2 e b = 2
		System.out.println(a == b); // a = 2 e b = 1
		System.out.println(a);
		System.out.println(b);
		
		// ++a adicionou antes da compara��o
		// b-- diminuiu depois da compara��o
		
		// complemento bin�rio
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// nega��o
		System.out.println(!false);
		System.out.println(!true);
	}
}
