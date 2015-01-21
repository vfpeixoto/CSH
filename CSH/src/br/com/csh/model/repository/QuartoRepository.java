package br.com.csh.model.repository;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoBean;

@RequestScoped
public interface QuartoRepository extends GenericRepository<QuartoBean, Integer> {

	public Collection<QuartoBean> buscarPorNumero(int numero);		
}