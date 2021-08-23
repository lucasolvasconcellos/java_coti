package br.com.cotiinformatica.interfaces;

import java.util.List;

/*
 * <T>  tipo generico que ir� representar uma entidade
 * <ID> tipo generico que ir� representar a chave prim�ria da entidade
 */
public interface ICrudRepository<T, ID> {

	// m�todos abstratos
	void create(T obj) throws Exception;

	void update(T obj) throws Exception;

	void delete(T obj) throws Exception;

	List<T> getAll() throws Exception;

	T getById(ID id) throws Exception;
}
