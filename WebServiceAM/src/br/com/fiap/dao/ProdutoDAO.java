package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Produto;

public interface ProdutoDAO extends GenericDAO<Produto, Integer> {

	List<Produto> listar();
	
}
