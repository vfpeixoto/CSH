package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "QuartoCategoria")
public class QuartoCategoriaBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 100)
	private String descricao;

	@Column(nullable = false, scale = 8, precision = 2)
	private double valor;
	
	@OneToMany(mappedBy="categoria")
	private Collection<QuartoBean> quartos;

	public String getDescricao() {
		return descricao;
	}

	public QuartoCategoriaBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public double getValor() {
		return valor;
	}

	public QuartoCategoriaBean setValor(double valor) {
		this.valor = valor;
		return this;
	}

	public Collection<QuartoBean> getQuartos() {
		return quartos;
	}

	public QuartoCategoriaBean setQuartos(Collection<QuartoBean> quartos) {
		this.quartos = quartos;
		return this;
	}

}
