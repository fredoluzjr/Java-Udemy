package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int ajuste = 32;
		final double fator = (5/9.0);
		
		int F;
		double C;
		
		F = 95;
		
		C = (F-ajuste) * fator;
		
		System.out.println(F + " °F é o mesmo que = " + C + "°C");
		
	}
}