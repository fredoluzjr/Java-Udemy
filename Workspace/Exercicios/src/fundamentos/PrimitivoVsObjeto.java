package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase(); // String � tipo Objeto
		
		int a = 3; // int � tipo Primitivo, por exemplo
		System.out.println(a);
		
		int b = 132;
		System.out.println(b);
	}
}
