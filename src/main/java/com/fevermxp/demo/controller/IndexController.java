package com.fevermxp.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "index")
	public String helloWorld(Model model, HttpSession session){
		
		return "index";
	}
}
