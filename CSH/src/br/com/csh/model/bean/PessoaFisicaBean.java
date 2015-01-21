package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.csh.model.Sexo;

@Entity
@Table(name = "Fisica")
public class PessoaFisicaBean extends PessoaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=150, nullable=false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length=12, nullable=false)
	private String cpf;
	
	@Column(length=30)
	private String rg;
	
	@Column(length=5)
	private char orgaoEmissor;
	
	@Enumerated
	private Sexo sexo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "estadoCivilId")
	private EstadoCivilBean estadoCivil;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "profissaoId")
	private ProfissaoBean profissao;
	
	@ManyToMany(mappedBy="pessoasFisica")
	private Collection<PessoaJuridicaBean> pessoasJuridica;
	
	@ManyToOne
	@JoinColumn(name = "paisId")
	private PaisBean pais;

	@OneToOne(mappedBy="cliente")
	private HospedeBean hospede;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public char getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(char orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public EstadoCivilBean getEstadoCivil() {
		if (estadoCivil == null) {
			estadoCivil = new EstadoCivilBean();
		}
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivilBean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public ProfissaoBean getProfissao() {
		return profissao;
	}

	public void setProfissao(ProfissaoBean profissao) {
		this.profissao = profissao;
	}

	public Collection<PessoaJuridicaBean> getPessoasJuridica() {
		return pessoasJuridica;
	}

	public void setPessoasJuridica(Collection<PessoaJuridicaBean> pessoasJuridica) {
		this.pessoasJuridica = pessoasJuridica;
	}

	public PaisBean getPais() {
		return pais;
	}

	public void setPais(PaisBean pais) {
		this.pais = pais;
	}

	public HospedeBean getHospede() {
		return hospede;
	}

	public void setHospede(HospedeBean hospede) {
		this.hospede = hospede;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
