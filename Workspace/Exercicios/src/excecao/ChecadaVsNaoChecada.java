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
	
	// Exceção NÃO checada ou NÃO verifica -> o compilador te dá a opção de tratar ou não o erro
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro legal #01!"); // throw -> o erro precisa ser lançado
	}
	
	// Exceção checada ou verificada
	static void geraErro2() throws Exception { // throws -> deixar claro na assinatura que a exceção é checada
		throw new Exception("Ocorreu um erro legal #02!"); // Exception -> precisa colocar na assinatura do método que a exceção foi lançada
	}
}
