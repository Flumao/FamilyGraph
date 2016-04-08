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
 * UserController
 * @author Flumao
 *
 */
@Controller
public class UserController {
	
	private UserService userService;
	
	/**
	 * Query user node by name
	 * @param name 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(String name, Model model){
		List<User> users = userService.list(name);
		model.addAttribute("users", users);
		return "/list";
	}
	
	/**
	 * Query and create adjacency list
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
