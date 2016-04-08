package org.flumao.urlife.dao;

import java.util.List;

import org.flumao.urlife.entity.User;

/**
 * UserDao interface
 * @author Flumao
 *
 */
public interface UserDao {

	/**
	 * Query all users by personName
	 * @param name user's name
	 * @return
	 */
	List<User> list(String name);

	/**
	 * Create adjacency list by query personId
	 * @param personId user's Id
	 * @return
	 */
	List<User> adjacencyList(Integer personId);

	

}
