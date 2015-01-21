package br.com.csh.service;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoBean;

@RequestScoped
public interface QuartoService extends Serializable{
	
	void save(QuartoBean element);
	
	void update(QuartoBean element);
	
	void delete(QuartoBean element);
	
	QuartoBean findById(Integer key);
	
	Collection<QuartoBean> findAll();
	
	Collection<QuartoBean> buscarPorNumero(int numero);

}
