package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_AM_CONSULTOR")
@SequenceGenerator(name = "seqConsultor", sequenceName = "SQ_T_AM_CONSULTOR", allocationSize = 1)
public class Consultor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqConsultor")
	private int codigo;
	private String nome;
	private String cpf;
	private String senha;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
