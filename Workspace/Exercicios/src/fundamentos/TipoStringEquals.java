package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); // comparar strings com == n�o � aconselh�vel
		System.out.println("2".equals(s1)); // .equals compara o conte�do das strings
	
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // next tira os espa�os em branco e nextLine n�o tira
		System.out.println("2" == s2.trim()); // .trim apaga os espa�os em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
