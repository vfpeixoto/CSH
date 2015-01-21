package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.QuartoBean;
import br.com.csh.model.repository.QuartoRepository;
import br.com.csh.service.QuartoService;


public class QuartoServiceImpl implements	QuartoService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private QuartoRepository quartoRepository;

	@Override
	public void save(QuartoBean element) {
		quartoRepository.beginTransaction();
		quartoRepository.save(element);
		quartoRepository.commit();

	}

	@Override
	public void update(QuartoBean element) {
		quartoRepository.beginTransaction();
		quartoRepository.update(element);
		quartoRepository.commit();

	}

	@Override
	public void delete(QuartoBean element) {
		quartoRepository.beginTransaction();
		quartoRepository.delete(element);
		quartoRepository.commit();

	}

	@Override
	public QuartoBean findById(Integer key) {
		return quartoRepository.FindById(key);
	}

	@Override
	public Collection<QuartoBean> findAll() {
		return quartoRepository.findAll();

	}

	@Override
	public Collection<QuartoBean> buscarPorNumero(int numero) {
		return quartoRepository.buscarPorNumero(numero);
	}

}