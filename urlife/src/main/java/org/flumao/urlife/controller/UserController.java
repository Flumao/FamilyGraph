package org.flumao.urlife.controller;

import java.util.List;

import javax.inject.Inject;

import org.flumao.urlife.entity.Node;
import org.flumao.urlife.entity.User;
import org.flumao.urlife.service.UserService;
import org.flumao.urlife.util.GraphUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UserController类
 * @author Flumao
 *
 */
@Controller
public class UserController {
	
	private UserService userService;
	
	/**
	 * 查询人物名称为name的节点
	 * @param name 任务名称
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(String name, Model model){
		List<User> users = userService.list(name);
		model.addAttribute("users", users);
		return "/list";//对应的是jsp,全路径应该为/WEB-INF/jsp/list.jsp,前缀和后缀已经在xml里面配置好了
	}
	
	/**
	 * 查询并生成邻接矩阵
	 * @param personId
	 * @param model
	 * @return
	 */
	@RequestMapping("/show/{personId}")
	public String show(@PathVariable Integer personId, Model model){
		List<Node> adjacencyList = GraphUtil.setColorAndShape(userService.graph(personId));
		model.addAttribute("adjacencyList", adjacencyList);
		return "/show";
	}
	public UserService getUserService() {
		return userService;
	}

	@Inject
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
