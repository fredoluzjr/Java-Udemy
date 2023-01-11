package classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {	// deixando mais robusto. Verificando se objeto é uma instância de Usuario. 
			Usuario outro = (Usuario) objeto; // cast para o tipo Usuario
			
			boolean nomeIgual = outro.nome == this.nome; // não é aconselhável comparar Strings com ==, mas nesse caso, dá certo
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	// O hashcode é abordado em outra aula!
}
