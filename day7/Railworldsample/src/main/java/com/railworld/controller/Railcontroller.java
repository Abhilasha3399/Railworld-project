package com.railworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Railcontroller {
	@RequestMapping("/railworld")
	public String Railhomepage() {
		return "rail_home";
		
	}

}
