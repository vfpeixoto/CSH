package br.com.csh.model.repository;

import br.com.csh.model.bean.PessoaFisicaBean;

public class PessoaFisicaRepository extends GenericRepository<PessoaFisicaBean, Integer> {

	private static final long serialVersionUID = 1L;

	public PessoaFisicaRepository() {
		super(PessoaFisicaBean.class);
	}

}
