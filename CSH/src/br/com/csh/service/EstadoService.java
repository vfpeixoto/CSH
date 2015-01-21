package br.com.csh.service;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.EstadoBean;

@RequestScoped
public interface EstadoService extends Serializable{
	
	void save(EstadoBean element);
	
	void update(EstadoBean element);
	
	void delete(EstadoBean element);
	
	EstadoBean findById(Integer key);
	
	Collection<EstadoBean> findAll();
	
	Collection<EstadoBean> buscarPorDescricao(String element);
}
