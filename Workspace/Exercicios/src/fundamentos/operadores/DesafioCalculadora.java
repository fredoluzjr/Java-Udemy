package fundamentos.operadores;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); // convers�o
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		double menos = numero1 - numero2;
		double vezes = numero1 * numero2;
		double div = numero1 / numero2;
		double resto = numero1 % numero2;
		System.out.println("A Soma �: " + soma);
		System.out.println("A Subtra��o �: " + menos);
		System.out.println("A Multiplica��o �: " + vezes);
		System.out.println("A Divis�o �: " + div);
		System.out.println("O resto �: " + resto);
		/*System.out.println("A Soma de %d + %d = %d", numero1, numero2, soma);
		System.out.println("A Subtra��o de %d - %d = %d", numero1, numero2, menos);
		System.out.println("A Multiplica��o de %d * %d = %d", numero1, numero2, vezes);
		System.out.println("A Divis�o de %d / %d = %d", numero1, numero2, div);
		System.out.println("O resto de %d % %d = %d", numero1, numero2, resto);*/
	
		/*Scanner entrada = new Scanner(System.in);
		
		String num1 = entrada.next();
		String num2 = entrada.next();
		String operador = entrada.next();
		
		calculo = 
		
		entrada.close();*/
	}
}
