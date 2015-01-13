package br.com.csh.model.repository;

import br.com.csh.model.bean.QuartoBean;

public class QuartoRepository extends GenericRepository<QuartoBean, Integer> {

	private static final long serialVersionUID = 1L;

	public QuartoRepository() {
		super(QuartoBean.class);
	}

}
