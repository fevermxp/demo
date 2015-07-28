package com.fevermxp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class TestController extends AbstractBaseCotroller {
	
	@RequestMapping(value = "/icons", method = RequestMethod.GET)
	public String toPage(){
		return "admin/icons";
	}
}
