package br.com.csh.model.repository;

import br.com.csh.model.bean.EnderecoBean;

public class EnderecoRepository extends GenericRepository<EnderecoBean, Integer> {

	private static final long serialVersionUID = 1L;

	public EnderecoRepository() {
		super(EnderecoBean.class);
	}

}
