package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Pessoa")
public abstract class PessoaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pessoaID;
	@Column(name="email", length=150)
	private String email;
	@Temporal(TemporalType.TIME)
	@Column(name="dataAlteracao")
	private Date dataAlteracao;
	@Temporal(TemporalType.TIME)
	@Column(name="dataCadastrado")
	private Date dataCadastrado;
	@Column(name="ativo", length=150)
	private Boolean ativo;

	public PessoaBean() {
		super();
	} 
	
	public PessoaBean(int pessoaID, String email, Date dataAlteracao,
			Date dataCadastrado, Boolean ativo) {
		super();
		this.pessoaID = pessoaID;
		this.email = email;
		this.dataAlteracao = dataAlteracao;
		this.dataCadastrado = dataCadastrado;
		this.ativo = ativo;
	}

	public int getPessoaID() {
		return this.pessoaID;
	}
	public PessoaBean setPessoaID(int pessoaID) {
		this.pessoaID = pessoaID;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public PessoaBean setEmail(String email) {
		this.email = email;
		return this;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public PessoaBean setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
		return this;
	}
	public Date getDataCadastrado() {
		return dataCadastrado;
	}
	public PessoaBean setDataCadastrado(Date dataCadastrado) {
		this.dataCadastrado = dataCadastrado;
		return this;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public PessoaBean setAtivo(Boolean ativo) {
		this.ativo = ativo;
		return this;
	}	
   
}
