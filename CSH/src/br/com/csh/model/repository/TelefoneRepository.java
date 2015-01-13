package br.com.csh.model.repository;

import br.com.csh.model.bean.TelefoneBean;

public class TelefoneRepository extends GenericRepository<TelefoneBean, Integer> {

	private static final long serialVersionUID = 1L;

	public TelefoneRepository() {
		super(TelefoneBean.class);
	}

}
