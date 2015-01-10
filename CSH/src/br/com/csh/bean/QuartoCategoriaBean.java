package br.com.csh.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QuartoCategoria")
public class QuartoCategoriaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int quartoCategoriaID;
	@Column(name="descricao", length=150)
	private String descricao;
	@Column(name="descricao", scale=8, precision=2)
	private float valor;
	
	
	public QuartoCategoriaBean() {
		super();
	}
	
	public QuartoCategoriaBean(int quartoCategoriaID, String descricao,
			float valor) {
		super();
		this.quartoCategoriaID = quartoCategoriaID;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getQuartoCategoriaID() {
		return quartoCategoriaID;
	}
	public QuartoCategoriaBean setQuartoCategoriaID(int quartoCategoriaID) {
		this.quartoCategoriaID = quartoCategoriaID;
		return this;
	}
	public String getDescricao() {
		return descricao;
	}
	public QuartoCategoriaBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	public float getValor() {
		return valor;
	}
	public QuartoCategoriaBean setValor(float valor) {
		this.valor = valor;
		return this;
	}	

}
