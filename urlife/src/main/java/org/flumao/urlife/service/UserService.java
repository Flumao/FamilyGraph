package org.flumao.urlife.service;

import java.util.List;

import org.flumao.urlife.entity.User;

/**
 * UserService接口
 * @author Flumao
 *
 */
public interface UserService {

	/**
	 * 获得列表
	 * @param name 要查询的人名
	 * @return
	 */
	List<User> list(String name);

	/**
	 * 根据personId生成邻接表
	 * @param personId 要查询的人的id
	 * @return
	 */
	List<User> graph(Integer personId);

}
