package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = media >= 5.0 ? "Em recupera��o" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		// estrutura operadores tern�rios-> condi��o ? caso seja verdadeiro : caso seja falso
		
		// Poderia ser
		// String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Em recupera��o" : "Reprovado";
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 5.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("\nTem Desconto? " + resultado);
		// System.out.println("\n\nTem Desconto? %s", resultado);
	}
}
