package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // String n�o � uma palavra reservada do Java
		s = s.replace("X", "Senhora");// Por isso, deve colocar o ponto para qualquer a��o
		s = s.toUpperCase(); // nota��o de vari�vel com par�nteses no final � um comportamento
		s = s.concat("!!!");
		
		System.out.println(s); // out � um dado
		
		System.out.println("Alfredo".toUpperCase());
		
		String y = "Adeus X".replace("X", "cara");
		System.out.println(y);
		
		String t = "Bom dia X".replace("X", "baby").toUpperCase().concat("!!!"); // � poss�vel fazer esse tipo de a��o
		System.out.println(t);
		
		// Tipos primitivos n�o tem o operador "."
		int a;
		a = 3;
		System.out.println(a);
		
	}
}
