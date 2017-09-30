package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.entity.Produto;

public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Integer> implements ProdutoDAO {

	public ProdutoDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Produto> listar() {
		return em.createQuery("from Produto", Produto.class).getResultList();
	}

}
