package br.com.csh.model.repository.impl;

import java.util.Collection;

import br.com.csh.model.bean.QuartoBean;
import br.com.csh.model.repository.QuartoRepository;

public class QuartoRepositoryImpl extends	GenericRepositoryImpl<QuartoBean, Integer> 
										implements QuartoRepository {
	private static final long serialVersionUID = 1L;
	
	@Override
	public Collection<QuartoBean> buscarPorNumero(int numero) {
		return em
			.createNamedQuery("quartoBean.buscarPorNumero",
					QuartoBean.class)
			.setParameter("numero", numero)
			.getResultList();
	}
}
