package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try { // Bloco para tratamento da exce��o. Precisa ter o catch
			imprimirNomeDoAluno(a1); // NullPointerException
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento "
					+ "de imprimir o nome do usu�rio");
		}
		
		try { // gerado por Sorround With -> Try/catch Block
			System.out.println(7 / 0); // retorna erro: "ArithmeticException"
										// Diferente de JavaScript que retorna infinito
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
			//e.printStackTrace(); // printStackTrace mostra em que ponto a exce��o foi lan�ada
		}
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
