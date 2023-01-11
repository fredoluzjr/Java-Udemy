package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		 // Instanciando Data -> tipo Data
		Data d1 = new Data(); // construtor padrão -> Data(), já é implícito
		d1.dia = 10;
		d1.mes = "Fev";
		d1.ano = 1993;
		
		Data d2 = new Data(02, "Jul", 1996);
		//d2.dia = 02;
		//d2.mes = "Jul";
		//d2.ano = 1996;
		
		Data d3 = new Data();
		
		System.out.println("Data 1: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.println("Data 2: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		System.out.println(d3.obterData());
	}
}
