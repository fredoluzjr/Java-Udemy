package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt(); 
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir(); // tipo Integer foi determinado pela heran�a
		System.out.println(coisaA);
	}
}
