package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "?!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome  = "Santos";
		var idade = 33;
		var salario = 123456.12;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade:" + idade + " Salário: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$ %.2f.\n", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		// Várias funcionalidades da String
		System.out.println("\nFrase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
		System.out.println("\n");
		// A String é imutável. Após várias ações, ela não alterou
		System.out.println(s);
	}
}
