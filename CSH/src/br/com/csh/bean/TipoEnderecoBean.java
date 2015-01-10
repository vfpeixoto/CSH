package br.com.csh.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoEndereco")
public class TipoEnderecoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tipoEnderecoID;
	@Column(name="descricao", length=150)
	private String descricao;
	
	public TipoEnderecoBean() {
		super();
	}
	
	public TipoEnderecoBean(int tipoEnderecoID, String descricao) {
		super();
		this.tipoEnderecoID = tipoEnderecoID;
		this.descricao = descricao;
	}

	public int getTipoEnderecoID() {
		return tipoEnderecoID;
	}
	public TipoEnderecoBean setTipoEnderecoID(int tipoEnderecoID) {
		this.tipoEnderecoID = tipoEnderecoID;
		return this;
	}
	public String getDescricao() {
		return descricao;
	}
	public TipoEnderecoBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	

}
