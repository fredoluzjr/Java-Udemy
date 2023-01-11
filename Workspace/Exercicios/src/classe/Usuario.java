package classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {	// deixando mais robusto. Verificando se objeto � uma inst�ncia de Usuario. 
			Usuario outro = (Usuario) objeto; // cast para o tipo Usuario
			
			boolean nomeIgual = outro.nome == this.nome; // n�o � aconselh�vel comparar Strings com ==, mas nesse caso, d� certo
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	// O hashcode � abordado em outra aula!
}
