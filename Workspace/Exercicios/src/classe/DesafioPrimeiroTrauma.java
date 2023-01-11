package classe;

public class DesafioPrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui!
	static int b = 4;
	
	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma(); // se não mudar para static, precisa criar uma instância -> nomeDaClasse instância = new construtorPadrão();
		System.out.println(p.a); 
		
		System.out.println(b); // algo static consegue acessar algo static
	}
}
