package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.QuartoBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.QuartoService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class QuartoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String acao = "P";
	private QuartoBean quartoPesquisa;
	private QuartoBean quartoSelecionado;
	private Collection<QuartoBean> quarto;

	@Inject
	private QuartoService quartoService;

	public void pesquisar() {
		quarto = quartoService
				.buscarPorNumero(quartoPesquisa.getNumero());
	}
	
	public void all() {
		quarto = quartoService
				.findAll();
	}

	public void save() {

		if ("S".equals(acao)) {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			quartoSelecionado.setUsuario(user);
			quartoService.save(quartoSelecionado);
			quartoSelecionado = new QuartoBean();
		}else{
			quartoService.update(quartoSelecionado);
		}
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		quartoService.update(quartoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		quartoService.update(quartoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		quartoPesquisa = new QuartoBean();
		acao = "P";
	}

	public void prepareNovo() {
		quartoSelecionado = new QuartoBean();
	}

	@PostConstruct
	private void init() {
		acao = "P";
		quartoPesquisa = new QuartoBean();
		quarto = quartoService.findAll();
	}

	public Collection<QuartoBean> getQuarto() {
		return quarto;
	}

	public void setQuarto(Collection<QuartoBean> quarto) {
		this.quarto = quarto;
	}

	public QuartoBean getquartoPesquisa() {
		return quartoPesquisa;
	}

	public void setquartoPesquisa(QuartoBean quartoPesquisa) {
		this.quartoPesquisa = quartoPesquisa;
	}

	public QuartoBean getquartoSelecionado() {
		return quartoSelecionado;
	}

	public void setquartoSelecionado(
			QuartoBean quartoSelecionado) {
		this.quartoSelecionado = quartoSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
