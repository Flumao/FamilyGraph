package org.flumao.urlife.dao;

import java.lang.reflect.ParameterizedType;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * BaseDaoImpl
 * @author Flumao
 *
 * @param <T>
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
	private SessionFactory sessionFactory;

	private Class<?> clz;

	public Class<?> getClz(){
		if(clz == null){
			//Get a Class instance by reflection 
			clz = (Class<?>) (((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
		}
		return clz;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Inject
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	
}
