package br.com.csh.model.repository;

import br.com.csh.model.bean.ProfissaoBean;

public class ProfissaoRepository extends GenericRepository<ProfissaoBean, Integer> {

	private static final long serialVersionUID = 1L;

	public ProfissaoRepository() {
		super(ProfissaoBean.class);
	}

}
