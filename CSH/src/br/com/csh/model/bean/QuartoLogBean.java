package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "QuartoLog")
public class QuartoLogBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length = 4000)
	private String observacao;

	@Temporal(TemporalType.TIME)
	private Date dataOperacao;

	@ManyToOne
	@JoinColumn(name = "quartoId")
	private QuartoBean quarto;

	public int getId() {
		return id;
	}

	public QuartoLogBean setId(int id) {
		this.id = id;
		return this;
	}

	public String getObservacao() {
		return observacao;
	}

	public QuartoLogBean setObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}

	public Date getDataOperacao() {
		return dataOperacao;
	}

	public QuartoLogBean setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
		return this;
	}

	public QuartoBean getQuarto() {
		return quarto;
	}

	public QuartoLogBean setQuarto(QuartoBean quarto) {
		this.quarto = quarto;
		return this;
	}

	@PrePersist
	private void defaultPersist() {
		dataOperacao = new Date();
	}

}
