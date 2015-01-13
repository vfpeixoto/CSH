package br.com.csh.model.repository;

import br.com.csh.model.bean.HospedeBean;

public class HospedeRepository extends GenericRepository<HospedeBean, Integer> {

	private static final long serialVersionUID = 1L;

	public HospedeRepository() {
		super(HospedeBean.class);
	}

}
