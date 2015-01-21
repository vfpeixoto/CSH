package br.com.csh.service;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.CidadeBean;

@RequestScoped
public interface CidadeService extends Serializable{
	
	void save(CidadeBean element);
	
	void update(CidadeBean element);
	
	void delete(CidadeBean element);
	
	CidadeBean findById(Integer key);
	
	Collection<CidadeBean> findAll();
	
	Collection<CidadeBean> buscarPorDescricaoEstado(CidadeBean element);
}
