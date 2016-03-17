package org.flumao.urlife.dao;

import java.lang.reflect.ParameterizedType;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * BaseDaoImpl类
 * @author Flumao
 *
 * @param <T>
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
	private SessionFactory sessionFactory;

	private Class<?> clz;

	public Class<?> getClz(){
		if(clz == null){
			//反射生成Class的实例
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
