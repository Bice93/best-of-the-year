package com.example.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping()
	//@ResponseBody
	public String home(Model model) { 
		model.addAttribute("name", "Bianca");
		return "index";
		
//		return "<htmlm><body>"
//				+ "<h1>Best of the year by...!</h1>"
//				+ "</body></html>";
	}

}
