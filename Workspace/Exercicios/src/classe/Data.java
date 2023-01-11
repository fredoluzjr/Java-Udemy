package classe;

public class Data {
	
	int dia;
	String mes;
	int ano;
	
	// Quando declarar os tipos primitivos, os valores padrões são:
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	
	// String, Objetos -> null
	
	// Dentro de construtores e classes, precisa declarar e atribuir valor, senão dá erro.
	// Variáveis locais precisam ser atribuídas valores de forma explícita.
	
	//Construtor padrão
	Data() { // construtor não tem tipo primitivo antes do nome. Responsável por criar objetos (instâncias). 
		//  = 01;
		// mes = "Jan";
		// ano = 1970;
		this(1, "Jan", 1970);
		// Pode ser chamado referenciando outro construtor da classe.
		// Chamando um construtor a partir de outro construtor.
	}
	
	Data(int dia, String mes, int ano) { // construtor PRECISA ter o mesmo nome da classe. tipo de retorno implícito.
		this.dia = dia; // this é usado para referenciar o objeto usado no momento
		this.mes = mes; // this é uma das instâncias da classe. 
		this.ano = ano;	// Não pode ser usado em uma classe static 
						// e referencia um objeto da instância 
	}
	
	String obterData() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	String obterDataFormatada() { // Método(comportamento) = alguma ação -> retorno nome (parâmetros) 
		final String formato = "%d/%s/%d"; // Variável local. Foi declarada dentro dessa classe e só pode ser usada nessa classe.
		return String.format(formato, this.dia, mes, ano);
	}
	
}
