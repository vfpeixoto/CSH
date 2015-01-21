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

	public void setCodigoBanco(char codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCodigoOperacao() {
		return codigoOperacao;
	}

	public void setCodigoOperacao(String codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}
	
	
}
