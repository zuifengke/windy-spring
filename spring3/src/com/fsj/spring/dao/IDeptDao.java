package com.fsj.spring.dao;

import java.util.List;
import java.util.Map;

import com.fsj.spring.model.TDept;
import com.fsj.spring.model.TUser;
import com.fsj.spring.util.DataGridModel;
@SuppressWarnings("rawtypes")
public interface IDeptDao {

	public static final String CODE = "code";
	public static final String NAME = "name";

	public abstract void save(TDept transientInstance);

	public abstract void delete(TDept persistentInstance);

	public abstract TDept findById(java.lang.Integer id);

	
	public abstract List findByExample(TDept instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCode(Object code);

	public abstract List findByName(Object name);

	public abstract List findAll();

	public abstract TDept merge(TDept detachedInstance);

	public abstract void attachDirty(TDept instance);

	public abstract void attachClean(TDept instance);
	
	Map<String, Object> getPageList(DataGridModel dgm,TDept user) throws Exception;
	void addOrUpdate(TDept dept) throws Exception;
	void deleteDepts(List<Integer> deptsId) throws Exception;
}