package br.com.csh.model.repository;

import br.com.csh.model.bean.EstadoCivilBean;

public class EstadoCivilRepository extends GenericRepository<EstadoCivilBean, Integer> {

	private static final long serialVersionUID = 1L;

	public EstadoCivilRepository() {
		super(EstadoCivilBean.class);
	}

}
