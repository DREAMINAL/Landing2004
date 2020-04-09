package com.dk.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dk.landing.model.TestModel;
import com.dk.landing.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;

	@RequestMapping("/test")
	public String test(Model model) {

		TestModel board = testService.printTest();
		
		model.addAttribute("id", board.getId());
		model.addAttribute("subject", board.getSubject());
		model.addAttribute("content", board.getContent());
		model.addAttribute("regDate", board.getReg_date());
		
		return "test"; // JSP 파일명
	}
	
}
