package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.132456; // convers�o expl�cita (CAST) double -> float
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // convers�o expl�cita (CAST) int -> byte
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // convers�o expl�cita (CAST) double -> int
		System.out.println(f); // truncou, perdeu a informa��o
	}
}
