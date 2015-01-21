package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.CidadeBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.CidadeService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class CidadeMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String acao = "P";
	private CidadeBean cidadePesquisa;
	private CidadeBean cidadeSelecionado;
	private Collection<CidadeBean> cidade;

	@Inject
	private CidadeService cidadeService;

	public void pesquisar() {
		cidade = cidadeService
				.buscarPorDescricaoEstado(cidadePesquisa);

	}

	public void save() {

		if (acao == "S") {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			cidadeSelecionado.setUsuario(user);
			cidadeService.save(cidadeSelecionado);
			cidadeSelecionado = new CidadeBean();
		}else{
			cidadeService.update(cidadeSelecionado);
		}
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		cidadeService.update(cidadeSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		cidadeService.update(cidadeSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		cidadePesquisa = new CidadeBean();
		acao = "P";
	}

	public void prepareNovo() {
		cidadeSelecionado = new CidadeBean();
	}

	@PostConstruct
	private void init() {
		cidadePesquisa = new CidadeBean();
		cidade = cidadeService.findAll();
	}

	public Collection<CidadeBean> getCidade() {
		return cidade;
	}

	public void setCidade(Collection<CidadeBean> cidade) {
		this.cidade = cidade;
	}

	public CidadeBean getCidadePesquisa() {
		return cidadePesquisa;
	}

	public void setCidadePesquisa(CidadeBean cidadePesquisa) {
		this.cidadePesquisa = cidadePesquisa;
	}

	public CidadeBean getCidadeSelecionado() {
		return cidadeSelecionado;
	}

	public void setCidadeSelecionado(
			CidadeBean cidadeSelecionado) {
		this.cidadeSelecionado = cidadeSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
