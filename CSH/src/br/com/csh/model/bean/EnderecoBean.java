package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class EnderecoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 200)
	private String logradouro;

	@Column(nullable = false, length = 5)
	private int numero;

	@Column(nullable = false, length = 8)
	private String cep;

	@Column(nullable = false, length = 150)
	private String bairro;

	@Column(length = 100)
	private String complemento;

	@Column(length = 100)
	private String referencia;

	@ManyToOne
	@JoinColumn(name = "pessoaId")
	private PessoaBean pessoa;

	@ManyToOne
	@JoinColumn(name = "tipoEnderecoId")
	private TipoEnderecoBean tipoEndereco;

	@ManyToOne
	@JoinColumn(name = "cidadeId")
	private CidadeBean cidade;

	@ManyToOne
	@JoinColumn(name = "tipoLogradouroId")
	private TipoLogradouroBean tipoLogradouro;

	public String getLogradouro() {
		return logradouro;
	}

	public EnderecoBean setLogradouro(String logradouro) {
		this.logradouro = logradouro;
		return this;
	}

	public int getNumero() {
		return numero;
	}

	public EnderecoBean setNumero(int numero) {
		this.numero = numero;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public EnderecoBean setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public EnderecoBean setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getComplemento() {
		return complemento;
	}

	public EnderecoBean setComplemento(String complemento) {
		this.complemento = complemento;
		return this;
	}

	public String getReferencia() {
		return referencia;
	}

	public EnderecoBean setReferencia(String referencia) {
		this.referencia = referencia;
		return this;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public EnderecoBean setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
		return this;
	}

	public TipoEnderecoBean getTipoEndereco() {
		return tipoEndereco;
	}

	public EnderecoBean setTipoEndereco(TipoEnderecoBean tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
		return this;
	}

	public CidadeBean getCidade() {
		return cidade;
	}

	public EnderecoBean setCidade(CidadeBean cidade) {
		this.cidade = cidade;
		return this;
	}

	public TipoLogradouroBean getTipoLogradouro() {
		return tipoLogradouro;
	}

	public EnderecoBean setTipoLogradouro(TipoLogradouroBean tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
		return this;
	}

}
