package br.com.csh.service;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoCategoriaBean;

@RequestScoped
public interface QuartoCategoriaService extends Serializable{
	
	void save(QuartoCategoriaBean element);
	
	void update(QuartoCategoriaBean element);
	
	void delete(QuartoCategoriaBean element);
	
	QuartoCategoriaBean findById(Integer key);
	
	Collection<QuartoCategoriaBean> findAll();
	
	Collection<QuartoCategoriaBean> buscarPorDescricao(String descricao);
}
