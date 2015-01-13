package br.com.csh.model.repository;

import br.com.csh.model.bean.FuncionarioBean;

public class FornecedorRepository extends GenericRepository<FuncionarioBean, Integer> {

	private static final long serialVersionUID = 1L;

	public FornecedorRepository() {
		super(FuncionarioBean.class);
	}

}
