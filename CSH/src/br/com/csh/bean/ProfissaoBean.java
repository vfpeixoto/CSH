package br.com.csh.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profissao")
public class ProfissaoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int profissaoID;
	@Column(name="descricao", length=150)
	private String descricao;
	
	public ProfissaoBean() {
		super();
	}
	
	public ProfissaoBean(int profissaoID, String descricao) {
		super();
		this.profissaoID = profissaoID;
		this.descricao = descricao;
	}

	public int getProfissaoID() {
		return profissaoID;
	}
	public ProfissaoBean setProfissaoID(int profissaoID) {
		this.profissaoID = profissaoID;
		return this;
	}
	public String getDescricao() {
		return descricao;
	}
	public ProfissaoBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	
	
}
