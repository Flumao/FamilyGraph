package org.flumao.urlife.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.flumao.urlife.entity.User;
import org.springframework.stereotype.Repository;
/**
 * UserDaoImpl类
 * @author Flumao
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	@Override
	public List<User> list(String name) {
		String query = "from User u where personName=?";
		return getSession().createQuery(query).setParameter(0, name).list();
	}
	/**
	 * Create adjacency list by query personId
	 */
	@Override
	public List<User> adjacencyList(Integer personId) {
		String query = "from User u where personId=?";
		Set<User> set = new HashSet<User>(getSession().createQuery(query).setParameter(0, personId).list());
		LinkedList<User> q = new LinkedList<User>();
		q.addAll(set);
		while(!q.isEmpty()){
			User u = q.poll();
			List<User> us = getSession().createQuery("from User u where kinId=?").setParameter(0, u.getKinId()).list();
			for(User user : us){
				if(!set.contains(user)){
					set.add(user);
					q.offer(user);
				}
			}
			
		}
		return new ArrayList<User>(set);
	}

}
