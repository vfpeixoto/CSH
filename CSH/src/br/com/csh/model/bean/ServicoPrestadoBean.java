package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ServicoPrestado")
public class ServicoPrestadoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 100)
	private String nomeArquivo;

	@Column(nullable = false, length = 2)
	private int avaliacao;

	@Column(nullable = false, scale = 8, precision = 2)
	private double valorPrestado;

	@ManyToOne
	@JoinColumn(name = "fornecedorId")
	private FornecedorBean fornecedor;

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public ServicoPrestadoBean setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		return this;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public ServicoPrestadoBean setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
		return this;
	}

	public double getValorPrestado() {
		return valorPrestado;
	}

	public ServicoPrestadoBean setValorPrestado(double valorPrestado) {
		this.valorPrestado = valorPrestado;
		return this;
	}

	public FornecedorBean getFornecedor() {
		return fornecedor;
	}

	public ServicoPrestadoBean setFornecedor(FornecedorBean fornecedor) {
		this.fornecedor = fornecedor;
		return this;
	}

}
