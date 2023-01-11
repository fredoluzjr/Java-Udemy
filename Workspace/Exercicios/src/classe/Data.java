package classe;

public class Data {
	
	int dia;
	String mes;
	int ano;
	
	// Quando declarar os tipos primitivos, os valores padr�es s�o:
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	
	// String, Objetos -> null
	
	// Dentro de construtores e classes, precisa declarar e atribuir valor, sen�o d� erro.
	// Vari�veis locais precisam ser atribu�das valores de forma expl�cita.
	
	//Construtor padr�o
	Data() { // construtor n�o tem tipo primitivo antes do nome. Respons�vel por criar objetos (inst�ncias). 
		//  = 01;
		// mes = "Jan";
		// ano = 1970;
		this(1, "Jan", 1970);
		// Pode ser chamado referenciando outro construtor da classe.
		// Chamando um construtor a partir de outro construtor.
	}
	
	Data(int dia, String mes, int ano) { // construtor PRECISA ter o mesmo nome da classe. tipo de retorno impl�cito.
		this.dia = dia; // this � usado para referenciar o objeto usado no momento
		this.mes = mes; // this � uma das inst�ncias da classe. 
		this.ano = ano;	// N�o pode ser usado em uma classe static 
						// e referencia um objeto da inst�ncia 
	}
	
	String obterData() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	String obterDataFormatada() { // M�todo(comportamento) = alguma a��o -> retorno nome (par�metros) 
		final String formato = "%d/%s/%d"; // Vari�vel local. Foi declarada dentro dessa classe e s� pode ser usada nessa classe.
		return String.format(formato, this.dia, mes, ano);
	}
	
}
