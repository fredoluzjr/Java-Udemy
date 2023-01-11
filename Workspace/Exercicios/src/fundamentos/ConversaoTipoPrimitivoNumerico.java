package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.132456; // conversão explícita (CAST) double -> float
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // conversão explícita (CAST) int -> byte
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // conversão explícita (CAST) double -> int
		System.out.println(f); // truncou, perdeu a informação
	}
}
