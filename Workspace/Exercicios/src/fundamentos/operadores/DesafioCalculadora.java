package fundamentos.operadores;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); // conversão
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		double menos = numero1 - numero2;
		double vezes = numero1 * numero2;
		double div = numero1 / numero2;
		double resto = numero1 % numero2;
		System.out.println("A Soma é: " + soma);
		System.out.println("A Subtração é: " + menos);
		System.out.println("A Multiplicação é: " + vezes);
		System.out.println("A Divisão é: " + div);
		System.out.println("O resto é: " + resto);
		/*System.out.println("A Soma de %d + %d = %d", numero1, numero2, soma);
		System.out.println("A Subtração de %d - %d = %d", numero1, numero2, menos);
		System.out.println("A Multiplicação de %d * %d = %d", numero1, numero2, vezes);
		System.out.println("A Divisão de %d / %d = %d", numero1, numero2, div);
		System.out.println("O resto de %d % %d = %d", numero1, numero2, resto);*/
	
		/*Scanner entrada = new Scanner(System.in);
		
		String num1 = entrada.next();
		String num2 = entrada.next();
		String operador = entrada.next();
		
		calculo = 
		
		entrada.close();*/
	}
}
