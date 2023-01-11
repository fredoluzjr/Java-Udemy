package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		//Integer coisaA = (Integer) caixaA.abrir(); // exemplo de cast perigoso (Integer) pq o m�todo abrir retornar� um Object e o cast s� dar� certo que o retorno do abrir for um inteiro
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA); // Corrigindo, o cast correto seria Double
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ol�");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
