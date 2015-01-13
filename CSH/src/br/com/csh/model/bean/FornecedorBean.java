package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.csh.model.TipoConta;

@Entity
@Table(name = "Fornecedor")
public class FornecedorBean extends PessoaJuridicaBean {

	private static final long serialVersionUID = 1L;

	@Column(length = 5, nullable = false)
	private char codigoBanco;

	@Enumerated
	private TipoConta tipoConta;

	@Column(nullable = false, length = 10)
	private String agencia;

	@Column(nullable = false, length = 10)
	private String numeroConta;

	@Column(length = 5)
	private String codigoOperacao;

	public char getCodigoBanco() {
		return codigoBanco;
	}

	public FornecedorBean setCodigoBanco(char codigoBanco) {
		this.codigoBanco = codigoBanco;
		return this;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public FornecedorBean setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
		return this;
	}

	public String getAgencia() {
		return agencia;
	}

	public FornecedorBean setAgencia(String agencia) {
		this.agencia = agencia;
		return this;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public FornecedorBean setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
		return this;
	}

	public String getCodigoOperacao() {
		return codigoOperacao;
	}

	public FornecedorBean setCodigoOperacao(String codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
		return this;
	}
	
	
}
