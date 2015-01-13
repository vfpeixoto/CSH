package br.com.csh.model.repository;

import br.com.csh.model.bean.CidadeBean;

public class CidadeRepository extends GenericRepository<CidadeBean, Integer> {

	private static final long serialVersionUID = 1L;

	public CidadeRepository() {
		super(CidadeBean.class);
	}

}
