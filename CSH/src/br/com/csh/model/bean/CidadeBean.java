package br.com.csh.model.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Cidade")
@NamedQueries({
@NamedQuery(name="cidadeBean.buscarPorDescricaoEstado", query = "SELECT C FROM CidadeBean C "
														+ "WHERE (UPPER(C.descricao) like :descricao or C.descricao = '') "
														+ "or (C.estado.id = :estado or C.estado.id = 0) ")
})
public class CidadeBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="estadoId")
	private EstadoBean estado;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EstadoBean getEstado() {
		return estado;
	}

	public void setEstado(EstadoBean estado) {
		this.estado = estado;
	}
	
	

}
