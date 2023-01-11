package fundamentos;

public class AreaCincunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; // vari�vel
		final double PI = 3.14; // final indica que � uma constante

		/*
		 * nomes com todas letras min�sculas = vari�veis
		 * ou com a primeira letra ma�uscula a partir da 2� palavra
		 * por exemplo: raioDaCircunfer�ncia
		 * 
		 * nomes com todas letras mai�sculas = constante
		 */
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		System.out.println("�rea � " + area + "m�."); // + para concatenar
		System.out.printf("�rea � %f m�.", area); // printf imprime de forma formatada
		System.out.printf("\n�rea � %.2f m�.", area); // %f substitui o valor da vari�vel
	}
}