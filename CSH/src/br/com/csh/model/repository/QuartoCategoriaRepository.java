package br.com.csh.model.repository;

import br.com.csh.model.bean.QuartoCategoriaBean;

public class QuartoCategoriaRepository extends GenericRepository<QuartoCategoriaBean, Integer> {

	private static final long serialVersionUID = 1L;

	public QuartoCategoriaRepository() {
		super(QuartoCategoriaBean.class);
	}

}
