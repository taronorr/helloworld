package org.tkr.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
	@RequestMapping("/") 
	public static String home() {
		return "Hello World!";
	}
}