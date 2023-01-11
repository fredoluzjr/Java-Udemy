package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Carlos", assento);
				
		DAO<Object> dao = new DAO<>(); //persistir os dois objetos no banco de dados
		
		dao.abrirT() //abrir transação
			.incluir(assento) //colocar na ordem adequada. 1º assento
			.incluir(cliente) //2º cliente; Para não dar exceção
			.fecharT()
			.fechar();
	}
}
