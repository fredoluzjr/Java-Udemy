package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		
		// NÃO é aconselhável
		
		externo: for(int i = 0; i < 3; i++) { // dado nome ao for externo
			for(int j = 0; j < 3; j++) {
				if(i == 1) {
					continue externo; // pula o laço externo em i = 1 por estar rotulado
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
