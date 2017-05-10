package main.java.com.test.base;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * save entity
	 * 
	 * @param entity
	 */
	public void save(T entity);

	/**
	 * delete entity
	 * 
	 * @param id
	 */
	public void delete(long id);

	/**
	 * update entity
	 * 
	 * @param entity
	 */
	public void update(T entity);

	/**
	 * find entity
	 * 
	 * @param id
	 * @return
	 */
	public T getById(Long id);

	/**
	 * find entities by multiple ids
	 * 
	 * @param ids
	 * @return
	 */
	public List<T> findByIds(Long[] ids);

	/**
	 * find all entities
	 * 
	 * @return
	 */
	public List<T> findAll();
}
