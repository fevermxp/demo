package com.fevermxp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController extends AbstractBaseCotroller {
	
	@RequestMapping("/index")
	public String index() {
		
		return "admin/index";
	}
}
