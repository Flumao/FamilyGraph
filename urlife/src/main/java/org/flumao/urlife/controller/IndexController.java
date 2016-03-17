package org.flumao.urlife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * IndexController类，控制主页的跳转，跳转到/WEB-INF/jsp/index.jsp
 * @author Flumao
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping({"/","/index"})
	public String index(Model model){
		return "index";
	}
	
}
