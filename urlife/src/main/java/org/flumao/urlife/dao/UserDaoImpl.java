package org.flumao.urlife.dao;

import java.util.ArrayList;
import java.util.List;

import org.flumao.urlife.entity.User;
import org.springframework.stereotype.Repository;
/**
 * UserDaoImpl类
 * @author Flumao
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	/**
	 * 查询所有personName为name的记录
	 */
	@Override
	public List<User> list(String name) {
		String query = "from User u where personName=?";
		return getSession().createQuery(query).setParameter(0, name).list();
	}
	/**
	 * 查询所有有直接联系的亲属，并查询他们的亲属
	 */
	@Override
	public List<User> adjacencyList(Integer personId) {
		String query = "from User u where personId=?";
		List<User> users = getSession().createQuery(query).setParameter(0, personId).list();
		List<Integer> ids = new ArrayList<Integer>();
		for(User u : users){
			ids.add(u.getKinId());
		}
		users.addAll(getSession().createQuery("from User u where u.personId in (:ids)").setParameterList("ids", ids).list());
		return users;
	}

}
