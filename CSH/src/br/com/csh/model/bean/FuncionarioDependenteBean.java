package br.com.csh.model.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FuncionarioDependente")
public class FuncionarioDependenteBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, length = 150)
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@ManyToOne
	@JoinColumn(name = "funcionarioId")
	private FuncionarioBean funcionario;

	public int getId() {
		return id;
	}

	public FuncionarioDependenteBean setId(int id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public FuncionarioDependenteBean setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public FuncionarioDependenteBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public FuncionarioBean getFuncionario() {
		return funcionario;
	}

	public FuncionarioDependenteBean setFuncionario(FuncionarioBean funcionario) {
		this.funcionario = funcionario;
		return this;
	}
	
	
}
