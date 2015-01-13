package br.com.csh.model.repository;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public abstract class GenericRepository<T, K> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected EntityManager em;
	private Class<T> classe;

	public GenericRepository(Class<T> classe) {
		super();
		this.classe = classe;
	}

	public void save(T element) {
		if (element == null)
			throw new IllegalArgumentException("Parâmetro para adicionar nulo, operação cancelada!");
		em.persist(element);
		em.flush();
	}

	public void update(T element) {
		if (element == null)
			throw new IllegalArgumentException("Parâmetro para atualizar nulo, operação cancelada!");
		em.merge(element);
		em.flush();

	}

	public void delete(T element) {
		if (element == null)
			throw new IllegalArgumentException("Parâmetro para remover nulo, operação cancelada!");
		em.remove(element);
		em.flush();
	}

	public T findById(K key) {
		return em.find(classe, key);
	}

	public Collection<T> findAll() {
		String jpql = "SELECT C FROM " + classe.getSimpleName() + " C ";
		TypedQuery<T> query = em.createQuery(jpql, classe);
		return query.getResultList();
	}

	public void BeginTransction() {
		em.getTransaction().begin();
	}

	public void Commit() {
		em.getTransaction().commit();
	}

	public void RollBack() {
		em.getTransaction().rollback();
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
