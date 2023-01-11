package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		
		int b = (int) Math.pow(a, 2);

		int c = 3 * 2;
		int d = b / c;
		
		System.out.println(d);
		
		int e = (1 - 5) * (2 - 7);
		int f = e / 2;

		int g = (int) Math.pow(f, 2);
		System.out.println(g);
		
		int h = d - g;
		System.out.println(h);
		int i = (int) Math.pow(h, 3);

		int j = (int) Math.pow(10, 3);

		int k = i / j;
		
		System.out.println(k);
	}
}
