package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Juridica")
public class PessoaJuridicaBean extends PessoaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(length=60)
	private String razaoSocial;
	
	@Column(length=150)
	private String fantasia;
	
	@Column(length=20, unique=true)
	private String cnpj;
	
	@Column(length=15)
	private String inscricaoEstadual;
	
	@Column(length=15)
	private String inscricaoMunicipal;
	
	@Column(length=150, unique=true)
	private String codigoReserva;
	
	@ManyToMany
	@JoinTable(name="PessoasJuridicaXPessoasFisica",
			   joinColumns = @JoinColumn(name="pessoaJuridicaId"), 
			   inverseJoinColumns = @JoinColumn(name="pessoaFisicaId"))				
	private Collection<PessoaFisicaBean> pessoasFisica;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public String getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	
}
