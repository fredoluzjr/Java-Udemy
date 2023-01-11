package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		//Inferindo o tipo da variável double automaticamente
		var b = 4.5;
		System.out.println(b);
		
		//Inferindo o tipo da variável string automaticamente
		var c = "Texto";
		System.out.println(c);
		
		double d; // variável declarada
		d = 123.66; // variável inicializada
		System.out.println(d); // usada!
		// variaveis com tipo específico permitem declarar em uma linha e inicializar em outra
		
		var e = 4.5; // var não permite declarar em uma linha e inicializar em outra. Tem que ser na mesma linha.
		System.out.println(e);
		
		var f = 12; //Inferindo o tipo da variável inteiro automaticamente
		// f = 12.01 não é possível colocar outro tipo de variável quando já foi inferida. Por exemplo, double em uma var inferida inteira.
		System.out.println(f);
	}
}
