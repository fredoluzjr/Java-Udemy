package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o antepen�ltimo sal�rio: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o pen�ltimo sal�rio: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o �ltimo sal�rio: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		System.out.println("A media dos ultimos 3 salarios �: " + soma / 3);
	
		entrada.close();
	}
}
