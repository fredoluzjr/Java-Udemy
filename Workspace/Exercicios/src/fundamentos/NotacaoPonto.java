package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // String não é uma palavra reservada do Java
		s = s.replace("X", "Senhora");// Por isso, deve colocar o ponto para qualquer ação
		s = s.toUpperCase(); // notação de variável com parênteses no final é um comportamento
		s = s.concat("!!!");
		
		System.out.println(s); // out é um dado
		
		System.out.println("Alfredo".toUpperCase());
		
		String y = "Adeus X".replace("X", "cara");
		System.out.println(y);
		
		String t = "Bom dia X".replace("X", "baby").toUpperCase().concat("!!!"); // é possível fazer esse tipo de ação
		System.out.println(t);
		
		// Tipos primitivos não tem o operador "."
		int a;
		a = 3;
		System.out.println(a);
		
	}
}
