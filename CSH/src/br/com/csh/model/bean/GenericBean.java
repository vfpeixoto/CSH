package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class GenericBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.TIME)
	private Date dataCadastro;
	
	@Temporal(TemporalType.TIME)
	private Date dataAlteracao;
	
	@Temporal(TemporalType.TIME)
	private Date dataExclusao;
	
	private int usuarioCadastro;
	private int usuarioAlteracao;
	private int usuarioExlusao;
	
	@Transient
	private UsuarioBean usuarioBean;
	
	private boolean ativo;
	
	public int getId() {
		return id;
	}

	public GenericBean setId(int id) {
		this.id = id;
		return this;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public Date getDataExclusao() {
		return dataExclusao;
	}

	public int getUsuarioCadastro() {
		return usuarioCadastro;
	}

	public int getUsuarioAlteracao() {
		return usuarioAlteracao;
	}

	public int getUsuarioExlusao() {
		return usuarioExlusao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public GenericBean setAtivo(boolean ativo) {
		this.ativo = ativo;
		return this;
	}

	public UsuarioBean getUsuario() {
		return usuarioBean;
	}

	public GenericBean setUsuario(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
		return this;
	}

	@PrePersist
	private void defaultPersist() {
		dataCadastro = new Date();
		ativo = true;
		usuarioCadastro = usuarioBean.getId();
	}

	@PreUpdate
	void defaultUpdate() {
		if (ativo == false) {
			dataExclusao = new Date();
			usuarioExlusao = usuarioBean.getId();
		} else {
			dataAlteracao = new Date();
			usuarioAlteracao = usuarioBean.getId();
		}
	}
}
