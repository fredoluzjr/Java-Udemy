package controle;

import javax.swing.JOptionPane;

public class DesafioWhile {
	public static void main(String[] args) {
		double quant = 0;
		double total = 0;
		double media = 0;
		
		String valor = JOptionPane.showInputDialog(
				"Digite a nota: ");
				
		double nota = Double.parseDouble(valor);
		total = total + nota;
		quant++;		
		
		while(nota != -1) {
			String valor1 = JOptionPane.showInputDialog(
					"Digite a nota: ");
			nota = Double.parseDouble(valor1);
				
			if(nota <= 10 && nota >= 0) {
				total = total + nota;
				quant++;
			}
		}
		
		media = total / quant;
		
		System.out.println("O total das notas é: " + total);
		System.out.println("A quantidade de notas é: " + quant);
		System.out.println("\nA média é: " + media);
	}
}
