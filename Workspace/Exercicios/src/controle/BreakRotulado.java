package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		
		// N�O � aconselh�vel
		
		externo: for(int i = 0; i < 3; i++) { // dado nome ao for externo
			for(int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo; // interrompe o la�o externo por estar rotulado
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
