package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); // comparar strings com == não é aconselhável
		System.out.println("2".equals(s1)); // .equals compara o conteúdo das strings
	
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // next tira os espaços em branco e nextLine não tira
		System.out.println("2" == s2.trim()); // .trim apaga os espaços em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
