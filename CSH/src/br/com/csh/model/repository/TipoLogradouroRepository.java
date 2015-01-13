package br.com.csh.model.repository;

import br.com.csh.model.bean.TipoLogradouroBean;


public class TipoLogradouroRepository extends GenericRepository<TipoLogradouroBean, Integer> {

	private static final long serialVersionUID = 1L;

	public TipoLogradouroRepository() {
		super(TipoLogradouroBean.class);
	}

}
