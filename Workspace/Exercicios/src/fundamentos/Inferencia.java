package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		//Inferindo o tipo da vari�vel double automaticamente
		var b = 4.5;
		System.out.println(b);
		
		//Inferindo o tipo da vari�vel string automaticamente
		var c = "Texto";
		System.out.println(c);
		
		double d; // vari�vel declarada
		d = 123.66; // vari�vel inicializada
		System.out.println(d); // usada!
		// variaveis com tipo espec�fico permitem declarar em uma linha e inicializar em outra
		
		var e = 4.5; // var n�o permite declarar em uma linha e inicializar em outra. Tem que ser na mesma linha.
		System.out.println(e);
		
		var f = 12; //Inferindo o tipo da vari�vel inteiro automaticamente
		// f = 12.01 n�o � poss�vel colocar outro tipo de vari�vel quando j� foi inferida. Por exemplo, double em uma var inferida inteira.
		System.out.println(f);
	}
}
