package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.EstadoBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.EstadoService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class EstadoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String acao = "P";
	private EstadoBean estadoPesquisa;
	private EstadoBean estadoSelecionado;
	private Collection<EstadoBean> estado;

	@Inject
	private EstadoService estadoService;

	public void pesquisar() {
		estado = estadoService
				.buscarPorDescricao(estadoPesquisa.getDescricao());

	}

	public void save() {

		if (acao == "S") {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			estadoSelecionado.setUsuario(user);
			estadoService.save(estadoSelecionado);
			estadoSelecionado = new EstadoBean();
		}else{
			estadoService.update(estadoSelecionado);
		}
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		estadoService.update(estadoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		estadoService.update(estadoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		estadoPesquisa = new EstadoBean();
		acao = "P";
	}

	public void prepareNovo() {
		estadoSelecionado = new EstadoBean();
	}

	@PostConstruct
	private void init() {
		estadoPesquisa = new EstadoBean();
		estado = estadoService.findAll();
	}

	public Collection<EstadoBean> getestado() {
		return estado;
	}

	public void setestado(Collection<EstadoBean> estado) {
		this.estado = estado;
	}

	public EstadoBean getestadoPesquisa() {
		return estadoPesquisa;
	}

	public void setestadoPesquisa(EstadoBean estadoPesquisa) {
		this.estadoPesquisa = estadoPesquisa;
	}

	public EstadoBean getestadoSelecionado() {
		return estadoSelecionado;
	}

	public void setestadoSelecionado(
			EstadoBean estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
