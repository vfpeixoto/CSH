package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Fisica")
public class PessoaFisicaBean extends PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="nome", length=150)
	private String nome;
	@Temporal(TemporalType.TIME)
	@Column(name="dataNascimento")
	private Date dataNascimento;
	@Column(name="cpf", length=12)
	private String cpf;
	@Column(name="rg", length=12)
	private String rg;
	@Column(name="rg", length=5)
	private String orgaoEmissor;
	
	public PessoaFisicaBean() {
		super();
	}	

	public PessoaFisicaBean(int pessoaID, String email, Date dataAlteracao,
			Date dataCadastrado, Boolean ativo, String nome,
			Date dataNascimento, String cpf, String rg, String orgaoEmissor) {
		super(pessoaID, email, dataAlteracao, dataCadastrado, ativo);
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getNome() {
		return nome;
	}
	public PessoaFisicaBean setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public PessoaFisicaBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}
	public String getCpf() {
		return cpf;
	}
	public PessoaFisicaBean setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}
	public String getRg() {
		return rg;
	}
	public PessoaFisicaBean setRg(String rg) {
		this.rg = rg;
		return this;
	}
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public PessoaFisicaBean setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
		return this;
	}	
	
}
