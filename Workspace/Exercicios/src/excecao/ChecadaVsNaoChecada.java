package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exce��o N�O checada ou N�O verifica -> o compilador te d� a op��o de tratar ou n�o o erro
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro legal #01!"); // throw -> o erro precisa ser lan�ado
	}
	
	// Exce��o checada ou verificada
	static void geraErro2() throws Exception { // throws -> deixar claro na assinatura que a exce��o � checada
		throw new Exception("Ocorreu um erro legal #02!"); // Exception -> precisa colocar na assinatura do m�todo que a exce��o foi lan�ada
	}
}
