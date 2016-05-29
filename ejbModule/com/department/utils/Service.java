package com.department.utils;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class Service<E> {

	@PersistenceContext(name = "TestJPA")
	protected EntityManager em;
	private Class<E> entityClass;

	public Service(Class<E> cls) {
		this.entityClass = cls;
	}

	/**
	 * Create a new element in the database
	 * 
	 * @param object
	 *            instance of the element to create
	 * @throws Exception
	 *             if the operation field if exists or something
	 */
	public void create(E object) throws Exception {
		em.clear();
		em.persist(object);
		em.flush();
	}

	/**
	 * Update element or create a new one if it's not in the database
	 * 
	 * @param object
	 *            instance of the element to update or create
	 * @throws Exception
	 *             if the operation field
	 */
	public void update(E object) throws Exception {
		em.merge(object);
		em.flush();
	}

	/**
	 * delete element from database based on its id
	 * 
	 * @param object
	 *            instance of the element to delete
	 * @throws Exception
	 *             if the operation field
	 */
	public void delete(E object) throws Exception {
		em.remove(em.contains(object) ? object : em.merge(object));
		em.flush();
	}

	/**
	 * Find element by id in the correspondent entity
	 * 
	 * @param id
	 *            value of primary key column to find
	 * @return element matches the id
	 * @throws Exception
	 *             if the arguments are not of entity type
	 */
	public E findById(Object id) {
		return (E) em.find(entityClass, id);
	}

	/**
	 * Function returns all items for the associated entity
	 * 
	 * @param orderBy query for order by clause default order if null or empty
	 * @return List of elements in the table
	 * @throws Exception
	 *             if the query string is found to be invalid
	 */
	@SuppressWarnings("unchecked")
	public List<E> findAll(String orderBy) {
		orderBy = orderBy != null && orderBy.length()>0? " order by "+ orderBy : "";
		return em.createQuery("select e from " + entityClass.getName() + " e " + orderBy)
				.getResultList();
	}

	/**
	 * Using the field name and the value to test in a "field like 'value'"
	 * query
	 * 
	 * @param field
	 *            for the name of the column in the database
	 * @param value
	 *            represents the value to test for column
	 * @param orderBy query for order by clause default order if null or empty
	 * @return List of elements matches the where clause test
	 * @throws Exception
	 *             if the query string is found to be invalid
	 */
	@SuppressWarnings("unchecked")
	public List<E> findByField(String field, Object value, String orderBy) {
		orderBy = orderBy != null && orderBy.length()>0? " order by "+ orderBy : "";
		return em.createQuery(
				"select e from " + entityClass.getName() + " e where " + field
						+ " like '" + value + "'" +   orderBy).getResultList();
	}

	/**
	 * Using the fields name and the value to test in a "field like 'value' and ..."
	 * query
	 * 
	 * @param fields
	 *            list map<key, value> to test its equality in the where clause
	 * @param orderBy query for order by clause default order if null or empty
	 * @return List of elements matches the where clause test
	 * @throws Exception
	 *             if the query string is found to be invalid
	 */
	@SuppressWarnings("unchecked")
	public List<E> findByFields(Map<String, Object> params, String orderBy) {
		String args = "";
		Object[] keys = params.keySet().toArray();
		for(int i=0; i<params.size();i++){
			Object k = keys[i];
			args += k + " like '" + params.get(k) + "' and ";
		}
		orderBy = orderBy != null && orderBy.length()>0? " order by "+ orderBy : "";
		return em.createQuery(
				"select e from " + entityClass.getName() + " e where "
						+ args.substring(0, args.length() - 4) +  orderBy).getResultList();
	}

	/**
	 * Execute a Java Persistence query language statement for select.
	 * 
	 * @param query
	 *            a Java Persistence query string
	 * @param orderBy query for order by clause default order if null or empty
	 * @return list of elements matches the query as list result
	 * @throws Exception
	 *             if the query string is found to be invalid
	 */
	@SuppressWarnings("unchecked")
	public List<E> findByWhere(String where, String orderBy) {
		orderBy = orderBy != null && orderBy.length()>0? " order by "+ orderBy : "";
		return em.createQuery(
				"select e from " + entityClass.getName() + " e where " + where + orderBy).getResultList();
	}

	/**
	 * Execute a Java Persistence query language statement for select.
	 * 
	 * @param query
	 *            a Java Persistence query string
	 * @return list of elements matches the query as list result
	 * @throws Exception
	 *             if the query string is found to be invalid
	 */
	@SuppressWarnings("unchecked")
	public List<E> findByQuery(String query) {
		return em.createQuery(query).getResultList();
	}

	/**
	 * Execute a Java Persistence query language statement for CRUD.
	 * 
	 * @param query
	 *            a Java Persistence query string
	 * @return number of elements affected by the update or delete statement
	 * @throws Exception
	 *             if the query string is found to be invalid
	 */
	public Integer updateQuery(String query) throws Exception {
		return em.createQuery(query).executeUpdate();
	}

}
