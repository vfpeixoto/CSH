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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Hospede")
public class HospedeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
	private int hospedeId;

	@Column(nullable = false, length = 150)
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@OneToOne
	@JoinColumn(name = "pessoaFisicaId")
	private PessoaFisicaBean cliente;

	@ManyToOne
	@JoinColumn(name = "reservaId")
	private ReservaBean reserva;

	public int getHospedeId() {
		return hospedeId;
	}

	public HospedeBean setHospedeId(int hospedeId) {
		this.hospedeId = hospedeId;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public HospedeBean setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public HospedeBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public PessoaFisicaBean getCliente() {
		return cliente;
	}

	public HospedeBean setCliente(PessoaFisicaBean cliente) {
		this.cliente = cliente;
		return this;
	}

	public ReservaBean getReserva() {
		return reserva;
	}

	public HospedeBean setReserva(ReservaBean reserva) {
		this.reserva = reserva;
		return this;
	}

}
