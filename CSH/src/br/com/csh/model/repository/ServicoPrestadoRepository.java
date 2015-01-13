package br.com.csh.model.repository;

import br.com.csh.model.bean.ServicoPrestadoBean;

public class ServicoPrestadoRepository extends GenericRepository<ServicoPrestadoBean, Integer> {

	private static final long serialVersionUID = 1L;

	public ServicoPrestadoRepository() {
		super(ServicoPrestadoBean.class);
	}

}
