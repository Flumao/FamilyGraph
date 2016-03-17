package org.flumao.urlife.service;

import java.util.List;

import javax.inject.Inject;

import org.flumao.urlife.dao.UserDao;
import org.flumao.urlife.entity.User;
import org.flumao.urlife.util.DataUtil;
import org.springframework.stereotype.Service;
/**
 * UserServiceImpl类，实现了UserService接口
 * @author Flumao
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	@Inject
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 获得列表
	 */
	@Override
	public List<User> list(String name) {
		
		List<User> users= userDao.list(name);
		DataUtil.removeDuplicate(users);
		return users;
	}
	/**
	 * 生成邻接表
	 */
	@Override
	public List<User> graph(Integer personId) {
		return userDao.adjacencyList(personId);
	}
	
	

}
