package org.tkr.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
	@RequestMapping("/") 
	public static String home() {
		return "Hello World!";
	}
	@RequestMapping("/hello")
	public static String hello(Model model) {
		String name = "Taro";
		model.addAttribute("name", name);
		return "Hello World!";
	}
	
}