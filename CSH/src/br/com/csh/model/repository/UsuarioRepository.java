package br.com.csh.model.repository;

import br.com.csh.model.bean.UsuarioBean;


public class UsuarioRepository extends GenericRepository<UsuarioBean, Integer> {

	private static final long serialVersionUID = 1L;

	public UsuarioRepository() {
		super(UsuarioBean.class);
	}

}
