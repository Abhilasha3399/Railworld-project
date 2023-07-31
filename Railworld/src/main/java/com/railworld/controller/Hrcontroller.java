package com.railworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

import com.railworld.entity.Hr1;
import com.railworld.service.Hrservice;

@Controller
public class Hrcontroller {
	@Autowired
	private Hrservice hrservice; 
	
	@RequestMapping(value="/savehr",method = RequestMethod.POST)
	public String SaveHr(@ModelAttribute("hr") Hr1 hr,Model model) {
		hrservice.SaveHr(hr);
		model.addAttribute("hr",hr);
		
		   
	   
		return "hr_page";
	}

}
