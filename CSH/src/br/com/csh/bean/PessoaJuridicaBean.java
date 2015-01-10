package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Juridica")
public class PessoaJuridicaBean extends PessoaBean implements Serializable {


	private static final long serialVersionUID = 1L;

	@Column(name="razaoSocial", length=60)
	private String razaoSocial;
	@Column(name="fantasia", length=150)
	private String fantasia;
	@Column(name="cnpj", length=20)
	private String cnpj;
	@Column(name="inscricaoEstadual", length=15)
	private String inscricaoEstadual;
	@Column(name="inscricaoMunicipal", length=15)
	private String inscricaoMunicipal;
	@Column(name="codReserva", length=150)
	private String codReserva;
	
	public PessoaJuridicaBean() {
		super();
	}

	public PessoaJuridicaBean(int pessoaID, String email, Date dataAlteracao,
			Date dataCadastrado, Boolean ativo, String razaoSocial,
			String fantasia, String cnpj, String inscricaoEstadual,
			String inscricaoMunicipal, String codReserva) {
		super(pessoaID, email, dataAlteracao, dataCadastrado, ativo);
		this.razaoSocial = razaoSocial;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.codReserva = codReserva;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public PessoaJuridicaBean setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	public String getFantasia() {
		return fantasia;
	}
	public PessoaJuridicaBean setFantasia(String fantasia) {
		this.fantasia = fantasia;
		return this;
	}
	public String getCnpj() {
		return cnpj;
	}
	public PessoaJuridicaBean setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public PessoaJuridicaBean setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
		return this;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public PessoaJuridicaBean setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
		return this;
	}
	public String getCodReserva() {
		return codReserva;
	}
	public PessoaJuridicaBean setCodReserva(String codReserva) {
		this.codReserva = codReserva;
		return this;
	}

}
