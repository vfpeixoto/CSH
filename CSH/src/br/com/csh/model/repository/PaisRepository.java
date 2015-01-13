package br.com.csh.model.repository;

import br.com.csh.model.bean.PaisBean;

public class PaisRepository extends GenericRepository<PaisBean, Integer> {

	private static final long serialVersionUID = 1L;

	public PaisRepository() {
		super(PaisBean.class);
	}

}
