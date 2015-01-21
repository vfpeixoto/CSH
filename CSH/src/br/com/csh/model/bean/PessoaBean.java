package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PessoaBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, length = 150)
	private String email;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="pessoa")
	private Collection<EnderecoBean> endereco;
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	
	

}
