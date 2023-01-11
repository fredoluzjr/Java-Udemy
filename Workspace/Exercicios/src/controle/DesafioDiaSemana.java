package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita o dia da semana: ");
		
		String domingo = new String("Domingo");
		String segunda = new String("Segunda");
		String terca = new String("Terça");
		String quarta = new String("Quarta");
		String quinta = new String("Quinta");
		String sexta = new String("Sexta");
		String sabado = new String("Sábado");
		
		String dia = entrada.nextLine();
			
		if(dia.equalsIgnoreCase(domingo)) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase(segunda)) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase(terca)) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase(quarta)) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase(quinta)) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase(sexta)) {
			System.out.println("6");
		}  else if (dia.equalsIgnoreCase(sabado)) {
			System.out.println("7");
		}  else {
			System.out.println("Dia Inválido");
		}
		
		entrada.close();
	}
}
