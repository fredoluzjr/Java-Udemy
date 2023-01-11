package fundamentos;

import java.util.Date;

//import javax.swing.JButton; // A classe do JButton importada
							// colocada em cometário pois não foi usada

public class Import {
	public static void main(String[] args) {
		
		Date d = new Date(); // fazer o import da classe Date certo. Há varias classes Dates no Java, por exemplo
		System.out.println(d);
		
		//JButton botao = new JButton(); // fazendo o import de JButton, vai direto pois só tem um JButton no Java
		
		java.lang.String b = "Boa Tarde";
		java.lang.System.out.println(b); // pode colocar java.lang antes de quase tudo mas não há necessidade pq o Java interpreta automaticamente
	}
}
