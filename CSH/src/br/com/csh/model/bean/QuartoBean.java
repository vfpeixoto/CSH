package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Quarto")
public class QuartoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 5)
	private int numero;

	@OneToMany(mappedBy = "quarto")
	private Collection<QuartoLogBean> quartosLog;

	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "quartoId"), inverseJoinColumns = @JoinColumn(name = "quartoOpcionalId"))
	private Collection<QuartoOpcionalBean> quartoOpcionais;

	@ManyToOne
	@JoinColumn(name = "quartoCategoriaId")
	private QuartoCategoriaBean categoria;

	public int getNumero() {
		return numero;
	}

	public QuartoBean setNumero(int numero) {
		this.numero = numero;
		return this;
	}

	public Collection<QuartoLogBean> getQuartosLog() {
		return quartosLog;
	}

	public QuartoBean setQuartosLog(Collection<QuartoLogBean> quartosLog) {
		this.quartosLog = quartosLog;
		return this;
	}

	public Collection<QuartoOpcionalBean> getQuartoOpcionais() {
		return quartoOpcionais;
	}

	public QuartoBean setQuartoOpcionais(
			Collection<QuartoOpcionalBean> quartoOpcionais) {
		this.quartoOpcionais = quartoOpcionais;
		return this;
	}

	public QuartoCategoriaBean getCategoria() {
		return categoria;
	}

	public QuartoBean setCategoria(QuartoCategoriaBean categoria) {
		this.categoria = categoria;
		return this;
	}
}
