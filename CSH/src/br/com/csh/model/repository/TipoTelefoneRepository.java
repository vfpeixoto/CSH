package br.com.csh.model.repository;

import br.com.csh.model.bean.TipoTelefoneBean;


public class TipoTelefoneRepository extends GenericRepository<TipoTelefoneBean, Integer> {

	private static final long serialVersionUID = 1L;

	public TipoTelefoneRepository() {
		super(TipoTelefoneBean.class);
	}

}
