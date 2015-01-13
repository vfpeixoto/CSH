package br.com.csh.model.repository;

import br.com.csh.model.bean.PessoaJuridicaBean;

public class PessoaJuridicaRepository extends GenericRepository<PessoaJuridicaBean, Integer> {

	private static final long serialVersionUID = 1L;

	public PessoaJuridicaRepository() {
		super(PessoaJuridicaBean.class);
	}

}
