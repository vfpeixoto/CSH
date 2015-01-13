package br.com.csh.model.repository;

import br.com.csh.model.bean.ReservaBean;

public class ReservaRepository extends GenericRepository<ReservaBean, Integer> {

	private static final long serialVersionUID = 1L;

	public ReservaRepository() {
		super(ReservaBean.class);
	}

}
