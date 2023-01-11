package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		 * byte = tipo primitivos
		 * Byte com a primeira letra mai�scula � a vers�o 
		 * objeto do primitivo ou Wrapper.
		 * Vers�o completa do tipo primitivo.
		 * Pode ser colocado comportamento a partir de ent�o.
		 * 
		 * Wrappers s�o a vers�o objeto dos tipos primitivos!
		 */
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000"); // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		System.out.printf("Digite: ");
		Integer in = Integer.parseInt(entrada.next());
		System.out.println(in);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 123.456;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		entrada.close();
	}
}
