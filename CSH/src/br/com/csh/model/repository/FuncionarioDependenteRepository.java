package br.com.csh.model.repository;

import br.com.csh.model.bean.FuncionarioDependenteBean;

public class FuncionarioDependenteRepository extends GenericRepository<FuncionarioDependenteBean, Integer> {

	private static final long serialVersionUID = 1L;

	public FuncionarioDependenteRepository() {
		super(FuncionarioDependenteBean.class);
	}

}
