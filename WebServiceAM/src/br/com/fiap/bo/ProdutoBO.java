package br.com.fiap.bo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.dao.impl.ProdutoDAOImpl;
import br.com.fiap.entity.Produto;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class ProdutoBO {
	
	private EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
	
	public void cadastrar(Produto produto) {
		
		EntityManager em = fabrica.createEntityManager();
		ProdutoDAO dao = new ProdutoDAOImpl(em);
		dao.cadastrar(produto);
		
		try {
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
	}

}
