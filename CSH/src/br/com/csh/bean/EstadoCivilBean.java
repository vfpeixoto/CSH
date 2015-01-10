package br.com.csh.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EstadoCivil")
public class EstadoCivilBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estadoCivilID;
	@Column(name="descricao", length=150)
	private String descricao;
	
	public EstadoCivilBean() {
		super();
	}	
	
	public EstadoCivilBean(int estadoCivilID, String descricao) {
		super();
		this.estadoCivilID = estadoCivilID;
		this.descricao = descricao;
	}

	public int getEstadoCivilID() {
		return estadoCivilID;
	}
	public EstadoCivilBean setEstadoCivilID(int estadoCivilID) {
		this.estadoCivilID = estadoCivilID;
		return this;
	}
	public String getDescricao() {
		return descricao;
	}
	public EstadoCivilBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	
	
	
}
