package com.railworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/saveAdmin")
	public String SaveAdmin() {
		return "admin_page";
	}

}
