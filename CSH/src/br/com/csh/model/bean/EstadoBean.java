package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Estado")
public class EstadoBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=100)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="paisId")
	private PaisBean pais;
	
	@OneToMany(mappedBy="estado")
	private Collection<CidadeBean> cidade;
	
	public String getDescricao() {
		return descricao;
	}
	public EstadoBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	public PaisBean getPais() {
		return pais;
	}
	public EstadoBean setPais(PaisBean pais) {
		this.pais = pais;
		return this;
	}

	
}
