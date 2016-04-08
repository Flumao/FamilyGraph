package org.flumao.urlife.service;

import java.util.List;

import org.flumao.urlife.entity.User;

/**
 * UserService interface
 * @author Flumao
 *
 */
public interface UserService {

	/**
	 * list all users by name
	 * @param name 
	 * @return
	 */
	List<User> list(String name);

	/**
	 * Create graph by personId
	 * @param personId 
	 * @return
	 */
	List<User> graph(Integer personId);

}
