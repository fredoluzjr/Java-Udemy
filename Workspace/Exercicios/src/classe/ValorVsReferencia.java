package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, "Jun", 2022);
		Data d2 = d1; // atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = "Dez";
		
		System.out.println(d1.obterDataFormatada()); // impacta no dois porque ambas as vari�veis est�o referenciando para o mesmo objeto em mem�ria
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c); // n�o gerou impacto pq foram referenciados em lugares de mem�ria diferente.
		System.out.println(c); // por isso n�o printou 6
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = "Jan";
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
