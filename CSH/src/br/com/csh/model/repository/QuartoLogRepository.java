package br.com.csh.model.repository;

import br.com.csh.model.bean.QuartoLogBean;

public class QuartoLogRepository extends GenericRepository<QuartoLogBean, Integer> {

	private static final long serialVersionUID = 1L;

	public QuartoLogRepository() {
		super(QuartoLogBean.class);
	}

}
