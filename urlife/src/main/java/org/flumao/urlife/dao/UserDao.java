package org.flumao.urlife.dao;

import java.util.List;

import org.flumao.urlife.entity.User;

/**
 * UserDao接口
 * @author Flumao
 *
 */
public interface UserDao {

	/**
	 * 查询所有personName为name的记录
	 * @param name 人物姓名
	 * @return
	 */
	List<User> list(String name);

	/**
	 * 查询所有有直接联系的亲属，并查询他们的亲属
	 * @param personId 人物id
	 * @return
	 */
	List<User> adjacencyList(Integer personId);

	

}
