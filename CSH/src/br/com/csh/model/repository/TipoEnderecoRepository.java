package br.com.csh.model.repository;

import br.com.csh.model.bean.TipoEnderecoBean;


public class TipoEnderecoRepository extends GenericRepository<TipoEnderecoBean, Integer> {

	private static final long serialVersionUID = 1L;

	public TipoEnderecoRepository() {
		super(TipoEnderecoBean.class);
	}

}
