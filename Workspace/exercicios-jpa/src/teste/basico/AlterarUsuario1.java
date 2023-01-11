package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Alfredo");
		usuario.setEmail("alfredo@lanche.com.br");
		
		em.merge(usuario); //pega um objeto que já está no banco e fazer um comando de update 
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
