package arrays;

public class Foreach {
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < notas.length; i++) { // for normal referente ao foreach abaixo
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota: notas) { // Foreach -> para cada iteração, o for acessa cada valor do array
			System.out.print(nota + " "); // cria-se uma nota variável para referenciar para o array
		}
	}
}
