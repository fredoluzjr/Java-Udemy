package classe;

public class DesafioPrimeiroTrauma {
	
	int a = 3; // n�o pode mexer aqui!
	static int b = 4;
	
	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma(); // se n�o mudar para static, precisa criar uma inst�ncia -> nomeDaClasse inst�ncia = new construtorPadr�o();
		System.out.println(p.a); 
		
		System.out.println(b); // algo static consegue acessar algo static
	}
}
