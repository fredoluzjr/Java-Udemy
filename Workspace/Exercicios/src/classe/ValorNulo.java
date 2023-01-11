package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		// String s2; não vai compilar pois precisa ser atribuído valor 
		// System.out.println(s2.concat("????"));
		
		/*Data d1 = null;
		d1.dia = 3;*/ // Terá problema em tempo de execução
		// Porque não está apontando para nenhuma memória existente
		
		/*String s2 = null; // Terá problema em tempo de execução
		System.out.println(s2.concat("?????"));*/
		
		// Pode ser feito		
		Data d2 = Math.random() > 0.5 ? new Data() : null; // cria valor aleatório entre 0 e 1
		if(d2 != null) {
			d2.dia = 3;
			System.out.println(d2.obterDataFormatada());
		}
		
		String s3 = Math.random() > 0.5 ? "Opa" : null;
		if (s3 != null) {
			System.out.println(s3.concat("!"));
		}
	}
}
