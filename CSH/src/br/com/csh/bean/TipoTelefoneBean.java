package br.com.csh.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoTelefone")
public class TipoTelefoneBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tipoTelefoneID;
	@Column(name="descricao", length=150)
	private String descricao;
	
	public TipoTelefoneBean() {
		super();
	}

	public TipoTelefoneBean(int tipoTelefoneID, String descricao) {
		super();
		this.tipoTelefoneID = tipoTelefoneID;
		this.descricao = descricao;
	}

	public int getTipoTelefoneID() {
		return tipoTelefoneID;
	}
	public TipoTelefoneBean setTipoTelefoneID(int tipoTelefoneID) {
		this.tipoTelefoneID = tipoTelefoneID;
		return this;
	}
	public String getDescricao() {
		return descricao;
	}
	public TipoTelefoneBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	
	
	
}
