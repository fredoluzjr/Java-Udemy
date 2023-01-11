package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o antepenúltimo salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o penúltimo salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o último salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		System.out.println("A media dos ultimos 3 salarios é: " + soma / 3);
	
		entrada.close();
	}
}
