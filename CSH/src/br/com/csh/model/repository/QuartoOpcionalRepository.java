package br.com.csh.model.repository;

import br.com.csh.model.bean.QuartoOpcionalBean;

public class QuartoOpcionalRepository extends GenericRepository<QuartoOpcionalBean, Integer> {

	private static final long serialVersionUID = 1L;

	public QuartoOpcionalRepository() {
		super(QuartoOpcionalBean.class);
	}

}
