package br.com.csh.model.repository.impl;

import java.util.Collection;

import br.com.csh.model.bean.CidadeBean;
import br.com.csh.model.repository.CidadeRepository;

public class CidadeRepositoryImpl extends GenericRepositoryImpl<CidadeBean, Integer> 
								  implements CidadeRepository {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<CidadeBean> buscarPorDescricaoEstado(CidadeBean cidade) {
		return em
			.createNamedQuery("cidadeBean.buscarPorDescricaoEstado",
					CidadeBean.class)
			.setParameter("descricao", "%" + cidade.getDescricao().toUpperCase() + "%")
			.setParameter("estado", cidade.getEstado().getId())
			.getResultList();
	}

}
