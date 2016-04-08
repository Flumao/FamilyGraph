package org.flumao.urlife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * IndexController, direct to "/WEB-INF/jsp/index.jsp"
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
