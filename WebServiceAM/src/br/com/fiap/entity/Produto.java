package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_AM_PRODUTO")
@SequenceGenerator(name = "seqProduto", sequenceName = "SQ_T_AM_PRODUTO", allocationSize = 1)
public class Produto {

	@Id
	@GeneratedValue(generator = "seqProduto", strategy = GenerationType.SEQUENCE)
	private int codigo;
	private String nome;
	private int quantidade;
	private String nomeCliente;
	private String nomeConsultor;
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeConsultor() {
		return nomeConsultor;
	}

	public void setNomeConsultor(String nomeConsultor) {
		this.nomeConsultor = nomeConsultor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
