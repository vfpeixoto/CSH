package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Funcionario")
public class FuncionarioBean extends PessoaFisicaBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 20)
	private String pis;

	@Column(nullable = false, scale = 8, precision = 2)
	private double salario;

	@Temporal(TemporalType.TIME)
	private Date dataAdimissao;

	@Temporal(TemporalType.TIME)
	private Date dataDemissao;

	@OneToMany(mappedBy="funcionario")
	private Collection<FuncionarioDependenteBean> funcionariosDependente;
	
	public String getPis() {
		return pis;
	}

	public FuncionarioBean setPis(String pis) {
		this.pis = pis;
		return this;
	}

	public double getSalario() {
		return salario;
	}

	public FuncionarioBean setSalario(double salario) {
		this.salario = salario;
		return this;
	}

	public Date getDataAdimissao() {
		return dataAdimissao;
	}

	public FuncionarioBean setDataAdimissao(Date dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
		return this;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public FuncionarioBean setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
		return this;
	}

	public Collection<FuncionarioDependenteBean> getFuncionariosDependente() {
		return funcionariosDependente;
	}

	public FuncionarioBean setFuncionariosDependente(
			Collection<FuncionarioDependenteBean> funcionariosDependente) {
		this.funcionariosDependente = funcionariosDependente;
		return this;
	}

	
	
}
