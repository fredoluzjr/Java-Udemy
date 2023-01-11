package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		// estrutura operadores ternários-> condição ? caso seja verdadeiro : caso seja falso
		
		// Poderia ser
		// String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Em recuperação" : "Reprovado";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 5.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("\nTem Desconto? " + resultado);
		// System.out.println("\n\nTem Desconto? %s", resultado);
	}
}
