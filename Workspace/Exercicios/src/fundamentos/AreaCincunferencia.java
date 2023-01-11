package fundamentos;

public class AreaCincunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; // variável
		final double PI = 3.14; // final indica que é uma constante

		/*
		 * nomes com todas letras minúsculas = variáveis
		 * ou com a primeira letra maíuscula a partir da 2ª palavra
		 * por exemplo: raioDaCircunferência
		 * 
		 * nomes com todas letras maiúsculas = constante
		 */
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		System.out.println("Área é " + area + "m²."); // + para concatenar
		System.out.printf("Área é %f m².", area); // printf imprime de forma formatada
		System.out.printf("\nÁrea é %.2f m².", area); // %f substitui o valor da variável
	}
}